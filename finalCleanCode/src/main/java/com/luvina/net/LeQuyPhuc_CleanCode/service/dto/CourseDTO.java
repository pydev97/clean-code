package com.luvina.net.LeQuyPhuc_CleanCode.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseDTO {

    private Integer id;
    private String name;
    private String location;
	private String teacherName;
	private Instant opened;
}
