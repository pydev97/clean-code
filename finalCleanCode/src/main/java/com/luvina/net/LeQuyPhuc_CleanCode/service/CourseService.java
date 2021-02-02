package com.luvina.net.LeQuyPhuc_CleanCode.service;

import com.luvina.net.LeQuyPhuc_CleanCode.resource.response.CourseResponse;
public interface CourseService {
    CourseResponse sortCourse(String keyword,String orderName);
}
