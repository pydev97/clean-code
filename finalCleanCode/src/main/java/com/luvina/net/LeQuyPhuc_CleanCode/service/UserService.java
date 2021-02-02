package com.luvina.net.LeQuyPhuc_CleanCode.service;

import com.luvina.net.LeQuyPhuc_CleanCode.resource.request.RegisterRequest;
import com.luvina.net.LeQuyPhuc_CleanCode.resource.response.RegisterResponse;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    RegisterResponse registerUser(RegisterRequest registerRequest);
}
