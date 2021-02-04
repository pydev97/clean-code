package com.luvina.net.LeQuyPhuc_CleanCode.error;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApiError {

    private String errorCode;

    private String errorMessage;

}