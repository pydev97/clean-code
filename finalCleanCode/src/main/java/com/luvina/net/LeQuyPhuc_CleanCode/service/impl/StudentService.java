package com.luvina.net.LeQuyPhuc_CleanCode.service.impl;

import com.luvina.net.LeQuyPhuc_CleanCode.entity.Student;
import com.luvina.net.LeQuyPhuc_CleanCode.repository.StudentRepository;
import com.luvina.net.LeQuyPhuc_CleanCode.resource.request.RegisterRequest;
import com.luvina.net.LeQuyPhuc_CleanCode.resource.response.RegisterResponse;
import com.luvina.net.LeQuyPhuc_CleanCode.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Service;

@Service
public class StudentService implements UserService {
    @Autowired
    private StudentRepository studentRepository;

    @CachePut("student")
    @Override
    public RegisterResponse registerUser(RegisterRequest registerRequest) {
        Student student = new Student(null, registerRequest.getName(), registerRequest.getEmail(), registerRequest.getPassword(), registerRequest.getStudent().getYear());
        student = studentRepository.save(student);
        RegisterResponse response = new RegisterResponse();
        response.setName(student.getName());
        response.setEmail(student.getEmail());
        response.setPassword(student.getPassword());
        return response;
    }
}
