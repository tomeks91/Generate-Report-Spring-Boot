package controller;

import interactor.FinancialReportRequster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FinancialReportController {

    @Autowired
    private FinancialReportPresenter financialReportPresenter;

    @Autowired
    private FinancialReportRequster financialReportRequster;

    public void present(){
        financialReportPresenter.present(financialReportRequster.getData());
    };

}
