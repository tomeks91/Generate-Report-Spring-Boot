package com.example.demo.interactor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FinancialReportGenerator implements FinancialReportRequster {
    @Autowired
    private FinancialDataGateway financialDataGateway;

    @Override
    public FinancialReportResponse getData(FinancialReportRequest financialReportRequest) throws Exception {
        throw new Exception("Not implemented yet.");
    }

    @Override
    public FinancialReportResponse getData() {
        Iterable<Finance> finances = financialDataGateway.findAll();
        FinancialReportResponse financialReportResponse = new FinancialReportResponse();
        finances.forEach(finance -> financialReportResponse.addToFinanceList(finance));
        return financialReportResponse;
    }
}
