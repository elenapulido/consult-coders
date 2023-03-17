package com.ConsultCRUD.Consult.Coders.Model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Table(name= "consult")
public class CConsultation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "id", nullable = false)
    private long id;

    @Column (name = "name", nullable = false)
    private String name;
    @Column (name = "surname", nullable = false)
    private String surname;
    @Column (name = "telephone", nullable = false)
    private int telephone;
    @Column (name = "mail", nullable = false)
    private String mail;
    @Column (name = "theme", nullable = false)
    private String theme;
    @Column (name = "date", nullable = false)
    private String date;

}
