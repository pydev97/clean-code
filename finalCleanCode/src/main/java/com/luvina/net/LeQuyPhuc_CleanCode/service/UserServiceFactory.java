package com.luvina.net.LeQuyPhuc_CleanCode.service;

import com.luvina.net.LeQuyPhuc_CleanCode.constant.Constant;
import com.luvina.net.LeQuyPhuc_CleanCode.constant.RegisterMode;
import com.luvina.net.LeQuyPhuc_CleanCode.entity.User;
import com.luvina.net.LeQuyPhuc_CleanCode.error.ServiceRuntimeException;
import com.luvina.net.LeQuyPhuc_CleanCode.repository.UserRepository;
import com.luvina.net.LeQuyPhuc_CleanCode.service.impl.StudentService;
import com.luvina.net.LeQuyPhuc_CleanCode.service.impl.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserServiceFactory {

    @Autowired
    private TeacherService teacherService;

    @Autowired
    private StudentService studentService;

    @Autowired
    private UserRepository userRepository;

    public UserService createService(RegisterMode mode,String email) {
        //validate email
        Optional<User> user =  userRepository.findByEmail(email);
        if (user.isPresent()) {
            throw new ServiceRuntimeException(HttpStatus.NOT_FOUND,Constant.ERR_01,"Email is existed");
        }
        switch (mode) {
            case STUDENT:
                return studentService;
            case TEACHER:
                return teacherService;
            default:
                throw new ServiceRuntimeException(HttpStatus.NOT_FOUND, Constant.ERR_01, "Unsupported register mode");

        }
    }
}
