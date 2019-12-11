package managementtool.be.project.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
    private Long        enterpriseId;
    private String      entitle;
    private String      description;
    private LocalDate   startDate;
    private LocalDate   endDate;
}
