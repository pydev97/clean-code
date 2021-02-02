package com.luvina.net.LeQuyPhuc_CleanCode.resource;

import com.luvina.net.LeQuyPhuc_CleanCode.resource.response.CourseResponse;
import com.luvina.net.LeQuyPhuc_CleanCode.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class CourseResource {
    @Autowired
    private CourseService courseService;
    @GetMapping(path = "/courses", produces = MediaType.APPLICATION_JSON_VALUE) ResponseEntity<CourseResponse> sortCourse(
            @RequestParam(required = false, name = "keyword") String keyword,
            @RequestParam(required = false, name = "sortName") String sortName) {
        return ResponseEntity.ok(courseService.sortCourse(keyword, sortName));
    }
}
