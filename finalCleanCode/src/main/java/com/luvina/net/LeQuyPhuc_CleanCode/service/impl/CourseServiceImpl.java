package com.luvina.net.LeQuyPhuc_CleanCode.service.impl;

import com.luvina.net.LeQuyPhuc_CleanCode.constant.Constant;
import com.luvina.net.LeQuyPhuc_CleanCode.entity.Course;
import com.luvina.net.LeQuyPhuc_CleanCode.error.ServiceRuntimeException;
import com.luvina.net.LeQuyPhuc_CleanCode.repository.CourseRepository;
import com.luvina.net.LeQuyPhuc_CleanCode.resource.response.CourseResponse;
import com.luvina.net.LeQuyPhuc_CleanCode.service.CourseService;
import com.luvina.net.LeQuyPhuc_CleanCode.service.SortStrategy;
import com.luvina.net.LeQuyPhuc_CleanCode.service.dto.CourseDTO;
import com.luvina.net.LeQuyPhuc_CleanCode.service.strategy.SortByName;
import com.luvina.net.LeQuyPhuc_CleanCode.service.strategy.SortByOpened;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    private static Map<String, SortStrategy> strategies;

    static {
        strategies = new HashMap<>();
        strategies.put("name", new SortByName());
        strategies.put("open", new SortByOpened());
    }

//    @Cacheable(value = "course",key = "#keyword")
    @Override public CourseResponse sortCourse(String keyword, String orderName) {
        CourseResponse response = new CourseResponse();
        List<Course> courses = new ArrayList<>();
        List<CourseDTO> data = new ArrayList<>();
        if (keyword == null || keyword.isEmpty()) {
            courses = courseRepository.findAll();
        } else {
            courses = courseRepository.findAllByCourseNameLike(keyword);
        }
        for (Course course : courses) {
            CourseDTO courseDTO = new CourseDTO();
            courseDTO.setName(course.getCourseName());
            courseDTO.setId(course.getCourseId());
            courseDTO.setLocation(course.getLocation());
            courseDTO.setTeacherName(course.getTeacher().getName());
            courseDTO.setOpened(course.getOpened());
            data.add(courseDTO);
        }
        if (orderName != null) {
            SortStrategy sortingStrategy = lookupSortingStrategy(orderName);
            sortingStrategy.sort(data);
        }
        response.setInformationCourse(data);
        return response;
    }

    private SortStrategy lookupSortingStrategy(String strategyName) {
        SortStrategy sortingStrategy = strategies.get(strategyName);
        if (sortingStrategy == null) {
            throw new ServiceRuntimeException(HttpStatus.NOT_FOUND, Constant.ERR_01,"Unsupported sorting strategy");
        }
        return sortingStrategy;
    }
}
