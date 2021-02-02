package com.luvina.net.LeQuyPhuc_CleanCode.entity;

import lombok.Data;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "teacher")
@Entity
@Data
public class Teacher  {
    @Id
    @Column(name = "teacher_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "teacher_sequence_generator")
    @SequenceGenerator(name = "teacher_sequence_generator", allocationSize = 1)
    private Integer teacherId;
    @Column(name = "phone", nullable = false)
    private String phone;
    @Column(name = "experiences", nullable = false)
    private Integer experiences;

    @Column(name = "user_id",nullable = false)
    private Integer userId;
}
