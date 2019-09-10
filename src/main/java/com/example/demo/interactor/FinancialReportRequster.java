package com.example.demo.interactor;

public interface FinancialReportRequster {
    FinancialReportResponse getData(FinancialReportRequest financialReportRequest) throws Exception;
    FinancialReportResponse getData();
}
