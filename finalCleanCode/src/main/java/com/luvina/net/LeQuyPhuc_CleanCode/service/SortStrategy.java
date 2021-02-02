package com.luvina.net.LeQuyPhuc_CleanCode.service;

import com.luvina.net.LeQuyPhuc_CleanCode.service.dto.CourseDTO;

import java.util.List;

public interface SortStrategy {

    void sort(List<CourseDTO> courses);
}
