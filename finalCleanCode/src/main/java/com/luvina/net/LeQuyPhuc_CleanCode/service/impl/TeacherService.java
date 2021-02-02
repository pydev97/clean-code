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
        User user = new User();
        user.setEmail(registerRequest.getEmail());
        user.setName(registerRequest.getName());
        user.setPassword(registerRequest.getPassword());
        user = userRepository.save(user);
        Teacher teacher = new Teacher();
        teacher.setUserId(user.getUserId());
        teacher.setExperiences(registerRequest.getTeacher().getExperiences());
        teacher.setPhone(registerRequest.getTeacher().getPhone());
        teacherRepository.save(teacher);
        RegisterResponse res = new RegisterResponse();
        res.setEmail(user.getEmail());
        res.setName(user.getName());
        res.setPassword(user.getPassword());
        return res;
    }
}
