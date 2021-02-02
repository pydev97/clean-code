package com.luvina.net.LeQuyPhuc_CleanCode.resource.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class TeacherRequest {

    @ApiModelProperty(value = "phone of teacher",example = "123456")
    private String phone;
    @ApiModelProperty(value = "experiences of teacher", example = "1")
    private Integer experiences;
}
