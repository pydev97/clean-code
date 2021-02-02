package com.luvina.net.LeQuyPhuc_CleanCode.service.impl;

import com.luvina.net.LeQuyPhuc_CleanCode.entity.Student;
import com.luvina.net.LeQuyPhuc_CleanCode.entity.User;
import com.luvina.net.LeQuyPhuc_CleanCode.repository.StudentRepository;
import com.luvina.net.LeQuyPhuc_CleanCode.repository.UserRepository;
import com.luvina.net.LeQuyPhuc_CleanCode.resource.request.RegisterRequest;
import com.luvina.net.LeQuyPhuc_CleanCode.resource.response.RegisterResponse;
import com.luvina.net.LeQuyPhuc_CleanCode.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Service;
import springfox.documentation.annotations.Cacheable;

@Service
public class StudentService implements UserService {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private UserRepository userRepository;
    @CachePut("student")
    @Override public RegisterResponse registerUser(RegisterRequest registerRequest) {
        Student student = new Student();
        student.setYear(registerRequest.getStudent().getYear());
        student.setEmail(registerRequest.getEmail());
        student.setName(registerRequest.getName());
        student.setPassword(registerRequest.getPassword());
        student = studentRepository.save(student);
        RegisterResponse response = new RegisterResponse();
        response.setName(student.getName());
        response.setEmail(student.getEmail());
        response.setPassword(student.getPassword());
        return response;
    }
}
