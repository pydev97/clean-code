package com.luvina.net.LeQuyPhuc_CleanCode.service.impl;

import com.luvina.net.LeQuyPhuc_CleanCode.entity.Teacher;
import com.luvina.net.LeQuyPhuc_CleanCode.entity.User;
import com.luvina.net.LeQuyPhuc_CleanCode.repository.TeacherRepository;
import com.luvina.net.LeQuyPhuc_CleanCode.repository.UserRepository;
import com.luvina.net.LeQuyPhuc_CleanCode.resource.request.RegisterRequest;
import com.luvina.net.LeQuyPhuc_CleanCode.resource.response.RegisterResponse;
import com.luvina.net.LeQuyPhuc_CleanCode.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Service;
import springfox.documentation.annotations.Cacheable;

@Service
public class TeacherService implements UserService {
    @Autowired
    private TeacherRepository teacherRepository;
    @Autowired
    private UserRepository userRepository;

    @CachePut("teacher")
    @Override public RegisterResponse registerUser(RegisterRequest registerRequest) {
        Teacher teacher = new Teacher();
        teacher.setEmail(registerRequest.getEmail());
        teacher.setName(registerRequest.getName());
        teacher.setPassword(registerRequest.getPassword());
        teacher.setExperiences(registerRequest.getTeacher().getExperiences());
        teacher.setPhone(registerRequest.getTeacher().getPhone());
       teacher = teacherRepository.save(teacher);
        RegisterResponse response = new RegisterResponse();
        response.setEmail(teacher.getEmail());
        response.setName(teacher.getName());
        response.setPassword(teacher.getPassword());
        return response;
    }
}
