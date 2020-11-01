package com.youcode.questionnaire.questionnaireyoucode.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author : Gouzhong
 * @Blog : www.gouzhong1223.com
 * @Description :
 * @Date : create by QingSong in 2020-11-01 12:55
 * @Email : gouzhong1223@gmail.com
 * @Since : JDK 1.8
 * @PackageName : com.youcode.questionnaire.questionnaireyoucode.entity
 * @ProjectName : questionnaire-youcode
 * @Version : 1.0.0
 */
@ApiModel(value = "com-youcode-questionnaire-questionnaireyoucode-entity-AdminUser")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AdminUser implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 用户主键
     */
    @ApiModelProperty(value = "用户主键")
    private Integer id;
    /**
     * 用户名
     */
    @ApiModelProperty(value = "用户名")
    private String userName;
    /**
     * 用户密码
     */
    @ApiModelProperty(value = "用户密码")
    private String password;
}
