package com.luvina.net.LeQuyPhuc_CleanCode.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Collection;

@Table(name = "student")
@Entity
@Data
@PrimaryKeyJoinColumn(name = "user")
public class Student extends User {

    @Column(name = "year", nullable = false)
    private Integer year;

    @ManyToMany(mappedBy = "student")
    @EqualsAndHashCode.Exclude
    private Collection<Course> course;

}
