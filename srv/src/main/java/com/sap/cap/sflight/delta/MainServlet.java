package com.sap.cap.sflight.delta;

@org.springframework.stereotype.Component
@jakarta.servlet.annotation.WebServlet(
    loadOnStartup =  MainServlet.LOAD_ON_STARTUP,
    urlPatterns = { MainServlet.CONTEXT_PATH })
public class MainServlet extends com.sap.cap.sflight.delta.base.MainServletBase {
    private static final long serialVersionUID = 1L;

    private static volatile MainServlet singleton = null;

    { this.startShutdownCheck(); }

    public void init(jakarta.servlet.ServletConfig config) throws jakarta.servlet.ServletException {
        // For customization, see also: LogSettings, ProviderSettings, TestSettings.
        singleton = this;
        try {
            super.init(config);
        }
        catch (Throwable error) {
            initFailed(error);
        }
    }

    public static MainServlet getInstance() {
        // Note: if calling this from another servlet, ensure the other servlet's loadOnStartup is > 110.
        if (singleton == null) throw new IllegalStateException("MainServlet is not yet initialized!");
        return singleton;
    }

    protected void service(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response)
        throws jakarta.servlet.ServletException, java.io.IOException
    {
        try {
            super.service(request, response);
        }
        catch (Error error) {
            // Attempt to log fatal errors, such as java.lang.OutOfMemoryError.
            com.sap.cloud.server.odata.core.ThreadSleep.forSeconds(60); // This may increase the chance of successful logging if error is transient.
            error.printStackTrace();
            com.sap.cloud.server.odata.core.DebugConsole.error("FATAL ERROR", new RuntimeException(error), true);
            com.sap.cloud.server.odata.core.DebugConsole.flush();
            throw error; // Web container (e.g. Tomcat) might not catch this; client might never receive a response. That's why we do the logging.
        }
    }
}
