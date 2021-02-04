package com.luvina.net.LeQuyPhuc_CleanCode.entity;

import lombok.Data;


import javax.persistence.*;

@Table(name = "teacher")
@Entity
@Data
public class Teacher extends User {
    @Column(name = "phone", nullable = false)
    private String phone;
    @Column(name = "experiences", nullable = false)
    private Integer experiences;

    public Teacher(Integer userId, String name, String email, String password,String phone,Integer experiences) {
        super(userId, name, email, password);
        this.phone = phone;
        this.experiences = experiences;
    }
}
