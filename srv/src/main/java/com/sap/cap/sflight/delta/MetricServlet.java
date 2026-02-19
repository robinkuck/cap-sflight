package com.sap.cap.sflight.delta;

@org.springframework.stereotype.Component
@jakarta.servlet.annotation.WebServlet(
    initParams = {
        @jakarta.servlet.annotation.WebInitParam(name = "saveMetricsEvery", value = MetricSettings.SAVE_METRICS_EVERY_PERIOD),
        @jakarta.servlet.annotation.WebInitParam(name = "retainMetricsFor", value = MetricSettings.RETAIN_METRICS_FOR_PERIOD) },
    loadOnStartup = MetricServlet.LOAD_ON_STARTUP,
    urlPatterns = { MetricServlet.CONTEXT_PATH })
public class MetricServlet extends com.sap.cap.sflight.delta.base.MetricServletBase {
    private static final long serialVersionUID = 1L;

    public static final boolean DEBUG_METRIC_SERVLET = false;
    public static final boolean TRACE_METRIC_SERVLET = false;

    public static final boolean DEBUG_METRIC_SERVICE = false;
    public static final boolean TRACE_METRIC_SERVICE = false;

    public void init(jakarta.servlet.ServletConfig config) throws jakarta.servlet.ServletException {
        // For customization, see also: MetricSettings.
        super.init(config);
    }
}
