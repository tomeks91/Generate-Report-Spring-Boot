package com.example.demo;

import controller.FinancialReportController;
import interactor.Finance;
import interactor.FinancialDataGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class Start {

    @Autowired
    private FinancialDataGateway financialDataGateway;

    @Autowired
    private FinancialReportController financialReportController;

    @EventListener(ApplicationReadyEvent.class)
    public  void runExample(){
        Finance finance = new Finance("Tomwar 1", BigDecimal.valueOf(15.0));
        financialDataGateway.save(finance);
        financialReportController.present();
    }
}
