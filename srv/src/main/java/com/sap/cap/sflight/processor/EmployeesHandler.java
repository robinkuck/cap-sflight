package com.sap.cap.sflight.processor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.sap.cds.services.cds.CdsReadEventContext;
import com.sap.cds.services.cds.CqnService;
import com.sap.cds.services.handler.EventHandler;
import com.sap.cds.services.handler.annotations.On;
import com.sap.cds.services.handler.annotations.ServiceName;

import cds.gen.northwind.Northwind_;
import cds.gen.travelservice.Employees_;
import cds.gen.travelservice.TravelService_;

@Component
@ServiceName(TravelService_.CDS_NAME)
public class EmployeesHandler implements EventHandler {

    @Autowired
    @Qualifier(Northwind_.CDS_NAME)
    private CqnService northwind;

    @On(event = CqnService.EVENT_READ, entity = Employees_.CDS_NAME)
    public void onRead(CdsReadEventContext context) {
        context.setResult(northwind.run(context.getCqn()));
    }

}