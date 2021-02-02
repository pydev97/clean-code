package com.luvina.net.LeQuyPhuc_CleanCode.service.strategy;

import com.luvina.net.LeQuyPhuc_CleanCode.service.SortStrategy;
import com.luvina.net.LeQuyPhuc_CleanCode.service.dto.CourseDTO;

import java.util.Comparator;
import java.util.List;

public class SortByName implements SortStrategy {
    @Override
    public void sort(List<CourseDTO> courses) {
        courses.sort(Comparator.comparing(CourseDTO::getTeacherName));
    }
}
