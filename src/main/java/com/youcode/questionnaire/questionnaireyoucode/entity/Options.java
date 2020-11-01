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
 * @Date : create by QingSong in 2020-11-01 14:36
 * @Email : gouzhong1223@gmail.com
 * @Since : JDK 1.8
 * @PackageName : com.youcode.questionnaire.questionnaireyoucode.entity
 * @ProjectName : questionnaire-youcode
 * @Version : 1.0.0
 */
@ApiModel(value = "com-youcode-questionnaire-questionnaireyoucode-entity-Options")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Options implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 选项 ID
     */
    @ApiModelProperty(value = "选项 ID")
    private Integer id;
    /**
     * 选项值
     */
    @ApiModelProperty(value = "选项值")
    private String optionValue;
    /**
     * 选项序号
     */
    @ApiModelProperty(value = "选项序号")
    private String optionSerial;
}
