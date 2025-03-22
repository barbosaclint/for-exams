package com.kurinto.forexams.person;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(
        name = "person",
        uniqueConstraints = @UniqueConstraint(
                name = "unique_lastname_email_unique",
                columnNames = {"lastname", "email"}
        )
)
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Person {
    @Id
    @SequenceGenerator(
            name = "person_id_seq",
            sequenceName = "person_id_seq",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "person_id_seq"
    )
    private Long id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String email;

    private String gender;
    private Integer age;

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                '}';
    }

}
