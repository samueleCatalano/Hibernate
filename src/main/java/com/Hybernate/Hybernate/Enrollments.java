package com.Hybernate.Hybernate;

import com.Hybernate.Hybernate.entities.Student;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Enrollments {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    @ManyToOne
    @JoinColumn(name = "student_id", referencedColumnName = "id")
    private Student student;
    @ManyToOne
    @JoinColumn(name = "classes_id", referencedColumnName = "id")
    private Classes classes;
}
