package interactor;

import com.google.common.collect.ImmutableList;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class FinancialReportResponse {
    public static final List<String> COLUMNS = ImmutableList.of("id", "name", "amount");
    private List<Finance> financeList = new ArrayList<>();

    public void addToFinanceList(Finance f){
        financeList.add(f);
    }
}
