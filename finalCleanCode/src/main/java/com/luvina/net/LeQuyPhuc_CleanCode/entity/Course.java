package com.luvina.net.LeQuyPhuc_CleanCode.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.time.Instant;
import java.util.Collection;

@Table(name = "course")
@Entity
@Data
public class Course {
    @Id
    @Column(name = "course_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "course_sequence_generator")
    @SequenceGenerator(name = "course_sequence_generator", allocationSize = 1)
    private Integer courseId;
    @Column(name = "course_name",nullable = false)
    private String courseName;
    @Column(name = "description",nullable = false)
    private String description;
    @Column(name = "location",nullable = false)
    private String location;
    @Column(name = "opened",nullable = false)
    private Instant opened;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude

    @JoinTable(name = "enroll",
            joinColumns = @JoinColumn(name = "course_id"),
            inverseJoinColumns = @JoinColumn(name = "id")
    )
    private Collection<Student> student;

    @ManyToOne
    @JoinColumn(name = "teacher_id") 
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Teacher teacher;
}
