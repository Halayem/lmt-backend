package managementtool.be.project.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Enterprise {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long    id;
    private String  name;
}
