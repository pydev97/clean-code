package com.luvina.net.LeQuyPhuc_CleanCode.repository;

import com.luvina.net.LeQuyPhuc_CleanCode.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
