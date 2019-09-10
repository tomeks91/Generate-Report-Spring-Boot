package com.example.demo.presenter;

import com.example.demo.controller.FinancialReportPresenter;
import com.example.demo.interactor.Finance;
import com.example.demo.interactor.FinancialReportResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PDFPresenter implements FinancialReportPresenter {
    @Autowired
    private PrintView printView;

    @Override
    public void present(FinancialReportResponse financialReportResponse) {
        PrintViewModel printViewModel = convertFinanceToPrintViewModel(financialReportResponse);
        printView.generate(printViewModel);
    }

    private PrintViewModel convertFinanceToPrintViewModel(FinancialReportResponse financialReportResponse) {
        PrintViewModel printViewModel = new PrintViewModel();
        printViewModel.setHeaders(FinancialReportResponse.COLUMNS);
        List<Finance> financeList = financialReportResponse.getFinanceList();
        List<List<String>> data = new ArrayList<>();
        financeList.forEach(finance -> data.add(mapFinanceToList(finance)));
        printViewModel.setBody(data);
        return printViewModel;
    }

    private List<String> mapFinanceToList(Finance finance) {
        List<String> financeBody = new ArrayList<>();
        financeBody.add(finance.getId().toString());
        financeBody.add(finance.getName());
        financeBody.add(finance.getAmmount().toString());
        return financeBody;
    }
}
