package com.luvina.net.LeQuyPhuc_CleanCode.resource;

import com.luvina.net.LeQuyPhuc_CleanCode.resource.request.RegisterRequest;
import com.luvina.net.LeQuyPhuc_CleanCode.resource.response.CourseResponse;
import com.luvina.net.LeQuyPhuc_CleanCode.resource.response.RegisterResponse;
import com.luvina.net.LeQuyPhuc_CleanCode.service.UserServiceFactory;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class UserResource {


    @Autowired UserServiceFactory userServiceFactory;

    @PostMapping(path = "/register-user", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation("Register user- user can be teacher or student")
    ResponseEntity<RegisterResponse> registerUser(@RequestBody RegisterRequest request) {
        return ResponseEntity.ok(userServiceFactory.createService(request.getMode(),request.getEmail()).registerUser(request));
    }
}
