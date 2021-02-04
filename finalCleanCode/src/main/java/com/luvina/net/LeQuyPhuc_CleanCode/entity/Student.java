package com.luvina.net.LeQuyPhuc_CleanCode.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Table(name = "student")
@Entity
@Data
@NoArgsConstructor
public class Student extends User {

    @Column(name = "year", nullable = false)
    private Integer year;

    @ManyToMany(mappedBy = "student")
    @EqualsAndHashCode.Exclude
    private Collection<Course> course;

    public Student(Integer id, String name,String email,String password,Integer year) {
        super(id,name,email,password);
        this.year = year;
    }
}
