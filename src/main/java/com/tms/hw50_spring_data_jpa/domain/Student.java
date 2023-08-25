package com.tms.hw50_spring_data_jpa.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "students")
@Data
public class Student {

    @Id
    @SequenceGenerator(name = "mySeqGen", sequenceName = "students_id_seq", allocationSize = 1)
    @GeneratedValue(generator = "mySeqGen")
    private Integer id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "surname")
    private String surname;

    @Column(name = "group_number")
    private Integer groupNumber;

    @Column(name = "paid_for_studying")
    private Boolean paidForStudying;
}
