package com.luvina.net.LeQuyPhuc_CleanCode.repository;

import com.luvina.net.LeQuyPhuc_CleanCode.entity.Course;
import com.luvina.net.LeQuyPhuc_CleanCode.service.dto.CourseDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course,Integer> {

    @Query("SELECT new com.luvina.net.LeQuyPhuc_CleanCode.service.dto.CourseDTO ("
            + "c.courseId AS id, "
            + "c.courseName AS name,"
            + "c.location,"
            + "c.opened,"
            + "u.name AS teacherName "
            + ") FROM "
            + "Course c "
            + "INNER JOIN Teacher teacher on c.teacherId = teacher.teacherId "
            + "INNER JOIN User u on u.userId = teacher.userId "
            + "WHERE c.courseName like %:keyword% ")
    List<CourseDTO> findByCourseNameLike(@Param("keyword") String keyword);



    @Query("SELECT new com.luvina.net.LeQuyPhuc_CleanCode.service.dto.CourseDTO ("
            + "c.courseId AS id, "
            + "c.courseName AS name,"
            + "c.location,"
            + "c.opened,"
            + "u.name as teacherName "
            + ") FROM "
            + "Course c "
            + "INNER JOIN Teacher teacher on c.teacherId = teacher.teacherId "
            + "INNER JOIN User u on u.userId = teacher.userId")
    List<CourseDTO> findAllCourse();
}
