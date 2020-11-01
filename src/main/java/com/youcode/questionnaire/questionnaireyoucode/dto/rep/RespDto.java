package com.youcode.questionnaire.questionnaireyoucode.dto.rep;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author : Gouzhong
 * @Blog : www.gouzhong1223.com
 * @Description :
 * @Date : create by QingSong in 2020-11-01 11:22
 * @Email : gouzhong1223@gmail.com
 * @Since : JDK 1.8
 * @PackageName : com.youcode.questionnaire.questionnaireyoucode.dto.rep
 * @ProjectName : questionnaire-youcode
 * @Version : 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RespDto<T> {
    private Integer code;
    private String message;
    private T data;
}
