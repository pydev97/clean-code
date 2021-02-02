package com.luvina.net.LeQuyPhuc_CleanCode.resource.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class RegisterResponse {

    @ApiModelProperty(value = "name of user", example = "Tran Van B")
    private String name;
    @ApiModelProperty(value = "email of user", example = "b.tran@gmali.com")
    private String email;
    @ApiModelProperty(value = "password of user", example = "123456")
    private String password;
}
