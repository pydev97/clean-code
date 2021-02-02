package com.luvina.net.LeQuyPhuc_CleanCode.repository;

import com.luvina.net.LeQuyPhuc_CleanCode.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course,Integer> {

    List<Course> findAllByCourseNameLike(String keyword);
}
