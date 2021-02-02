package com.luvina.net.LeQuyPhuc_CleanCode.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
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
    @Column(name = "teacher_id",nullable = false)
    private Integer teacherId;

//    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL) // Quan hệ 1-n với đối tượng ở dưới (Person) (1 địa điểm có nhiều người ở)
//    @EqualsAndHashCode.Exclude // không sử dụng trường này trong equals và hashcode
//    @ToString.Exclude // Khoonhg sử dụng trong toString()
//    private Collection<Student> student;
}
