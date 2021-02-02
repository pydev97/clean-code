package com.luvina.net.LeQuyPhuc_CleanCode.resource.response;

import com.luvina.net.LeQuyPhuc_CleanCode.service.dto.CourseDTO;
import lombok.Data;

import java.util.List;

@Data
public class CourseResponse {
    private List<CourseDTO> informationCourse;
}
