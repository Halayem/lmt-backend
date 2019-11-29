package managementtool.be.providers.model;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Employee {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long    id;
    private String  firstname;
    private String  lastname;
    private String  mailProfesional;
    private String  mailPersonal;
    private String  phoneNumber;
}
