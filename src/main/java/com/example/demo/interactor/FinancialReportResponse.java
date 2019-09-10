package com.example.demo.interactor;

import com.google.common.collect.ImmutableList;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FinancialReportResponse {
    public static final List<String> COLUMNS = ImmutableList.of("id", "name", "amount");
    List<Finance> financeList = new ArrayList<>();

    public void addToFinanceList(Finance f){
        financeList.add(f);
    }
}
