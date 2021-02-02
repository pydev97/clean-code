package com.luvina.net.LeQuyPhuc_CleanCode.repository;

import com.luvina.net.LeQuyPhuc_CleanCode.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher,Integer> {
}
