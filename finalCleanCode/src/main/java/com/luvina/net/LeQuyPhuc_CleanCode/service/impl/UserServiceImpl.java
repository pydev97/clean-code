package com.luvina.net.LeQuyPhuc_CleanCode.service.impl;

import com.luvina.net.LeQuyPhuc_CleanCode.resource.response.CourseResponse;
import com.luvina.net.LeQuyPhuc_CleanCode.service.SortStrategy;
import com.luvina.net.LeQuyPhuc_CleanCode.service.strategy.SortByName;
import com.luvina.net.LeQuyPhuc_CleanCode.service.strategy.SortByOpened;

import java.util.HashMap;
import java.util.Map;

public class UserServiceImpl {

    private static Map<String, SortStrategy> strategies;

    static {
        strategies = new HashMap<>();
        strategies.put("name", new SortByName());
        strategies.put("open", new SortByOpened());
    }

    public CourseResponse sortCourse(String keyword, String sortName) {
        if (keyword == null || keyword.isBlank()) {
            return null;
        }
        CourseResponse response = new CourseResponse();
        if(sortName == null || sortName.isBlank()) {
            // search all
        }
        // search and sort
        SortStrategy sortingStrategy = lookupSortingStrategy(sortName);
        //            List<CourseSubtype1Response> courses = queryStudents();
        //            sortingStrategy.sort(courses);
        //            response.setInformationCourse(courses);
        return response;
    }

    private SortStrategy lookupSortingStrategy(String strategyName) {
        SortStrategy sortingStrategy = strategies.get(strategyName);
        if (sortingStrategy == null) {
            throw new UnsupportedOperationException("Unsupported sorting strategy");
        }
        return sortingStrategy;
    }

}
