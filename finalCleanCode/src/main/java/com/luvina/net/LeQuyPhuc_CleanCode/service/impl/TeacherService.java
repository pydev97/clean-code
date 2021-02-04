package com.luvina.net.LeQuyPhuc_CleanCode.service.impl;

import com.luvina.net.LeQuyPhuc_CleanCode.entity.Teacher;
import com.luvina.net.LeQuyPhuc_CleanCode.repository.TeacherRepository;
import com.luvina.net.LeQuyPhuc_CleanCode.resource.request.RegisterRequest;
import com.luvina.net.LeQuyPhuc_CleanCode.resource.response.RegisterResponse;
import com.luvina.net.LeQuyPhuc_CleanCode.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Service;

@Service
public class TeacherService implements UserService {
    @Autowired
    private TeacherRepository teacherRepository;

    @CachePut("teacher")
    @Override
    public RegisterResponse registerUser(RegisterRequest registerRequest) {
        Teacher teacher = new Teacher(null, registerRequest.getName(), registerRequest.getEmail(), registerRequest.getPassword(), registerRequest.getTeacher().getPhone(), registerRequest.getTeacher().getExperiences());
        teacher = teacherRepository.save(teacher);
        RegisterResponse response = new RegisterResponse();
        response.setEmail(teacher.getEmail());
        response.setName(teacher.getName());
        response.setPassword(teacher.getPassword());
        return response;
    }
}
