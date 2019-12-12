package managementtool.be.project.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Project {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long        id;
    private Long        employeeId;

    @ManyToOne
    @JoinColumn
    private Enterprise  enterprise;

    private String      entitle;
    private String      description;
    private LocalDate   startDate;
    private LocalDate   endDate;
}
