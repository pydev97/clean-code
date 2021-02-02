package com.luvina.net.LeQuyPhuc_CleanCode.entity;

import lombok.Data;


import javax.persistence.*;

@Table(name = "teacher")
@Entity
@Data
@PrimaryKeyJoinColumn(name = "user")
public class Teacher extends User {
    @Column(name = "phone", nullable = false)
    private String phone;
    @Column(name = "experiences", nullable = false)
    private Integer experiences;
}
