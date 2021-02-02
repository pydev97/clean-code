package com.luvina.net.LeQuyPhuc_CleanCode.service.impl;

import com.luvina.net.LeQuyPhuc_CleanCode.repository.CourseRepository;
import com.luvina.net.LeQuyPhuc_CleanCode.resource.response.CourseResponse;
import com.luvina.net.LeQuyPhuc_CleanCode.service.CourseService;
import com.luvina.net.LeQuyPhuc_CleanCode.service.SortStrategy;
import com.luvina.net.LeQuyPhuc_CleanCode.service.dto.CourseDTO;
import com.luvina.net.LeQuyPhuc_CleanCode.service.strategy.SortByName;
import com.luvina.net.LeQuyPhuc_CleanCode.service.strategy.SortByOpened;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

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

    @Cacheable(value = "course",key = "#keyword")
    @Override public CourseResponse sortCourse(String keyword, String orderName) {
        List<CourseDTO> course = null;
        if (keyword == null || keyword.isEmpty()) {
            course = courseRepository.findAllCourse();
        } else {
            course = courseRepository.findByCourseNameLike(keyword);
        }
        if (orderName != null) {
            SortStrategy sortingStrategy = lookupSortingStrategy(orderName);
            sortingStrategy.sort(course);
        }
        CourseResponse res = new CourseResponse();
        res.setInformationCourse(course);
        return res;
    }

    private SortStrategy lookupSortingStrategy(String strategyName) {
        SortStrategy sortingStrategy = strategies.get(strategyName);
        if (sortingStrategy == null) {
            throw new UnsupportedOperationException("Unsupported sorting strategy");
        }
        return sortingStrategy;
    }
}
