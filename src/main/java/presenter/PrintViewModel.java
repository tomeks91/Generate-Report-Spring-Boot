package presenter;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class PrintViewModel {
    private List<String> headers;
    private List<List<String>> body;
}
