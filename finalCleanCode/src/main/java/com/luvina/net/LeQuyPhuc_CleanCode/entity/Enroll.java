package com.luvina.net.LeQuyPhuc_CleanCode.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "enroll")
@Entity
@Data
public class Enroll {
    @Id
    @Column(name = "enroll_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "enroll_sequence_generator")
    @SequenceGenerator(name = "enroll_sequence_generator", allocationSize = 1)
    private Integer enrollId;
    @Column(name = "student_id", nullable = false)
    private Integer studentId;
    @Column(name = "course_id", nullable = false)
    private Integer courseId;
}
