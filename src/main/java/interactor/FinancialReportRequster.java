package interactor;

public interface FinancialReportRequster {
    FinancialReportResponse getData(FinancialReportRequest financialReportRequest) throws Exception;
    FinancialReportResponse getData();
}
