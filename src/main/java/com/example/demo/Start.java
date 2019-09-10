package com.example.demo;

import com.example.demo.controller.FinancialReportController;
import com.example.demo.interactor.Finance;
import com.example.demo.interactor.FinancialDataGateway;
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
        Finance finance = new Finance(null, "Towar 1", BigDecimal.valueOf(100l));
        financialDataGateway.save(finance);
        financialReportController.present();
    }
}
