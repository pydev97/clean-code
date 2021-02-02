package com.luvina.net.LeQuyPhuc_CleanCode.resource.request;

import com.luvina.net.LeQuyPhuc_CleanCode.constant.RegisterMode;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class RegisterRequest{

@ApiModelProperty(value = "name of user", example = "Tran Van B")
    private String name;
    @ApiModelProperty(value = "email of user", example = "b.tran@gmali.com")
    private String email;
    @ApiModelProperty(value = "password of user", example = "123456")
    private String password;
    @ApiModelProperty(value = "extension data of user if user is student")
    private StudentRequest student;
    @ApiModelProperty(value = "extension data of user if user is teacher")
    private TeacherRequest teacher;
    @ApiModelProperty(value = "flag to register user", example = "TEACHER")
    private RegisterMode mode;
}
