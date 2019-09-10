package interactor;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Table(name="Finance")
@NoArgsConstructor
@Data
public class Finance {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(nullable = false)
    private String name;

    @NotNull
    private BigDecimal ammount;

    public Finance(String name, BigDecimal ammount){
        this.name = name;
        this.ammount = ammount;
    }
}
