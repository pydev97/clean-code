package com.luvina.net.LeQuyPhuc_CleanCode.entity;

import lombok.Data;

import javax.persistence.*;

@Table(name = "student")
@Entity
@Data
public class Student  {

    @Id
    @Column(name = "student_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence_generator")
    @SequenceGenerator(name = "student_sequence_generator", allocationSize = 1)
    private Integer studentId;
    @Column(name = "year", nullable = false)
    private Integer year;
    @Column(name = "user_id",nullable = false)
    private Integer userId;

}
