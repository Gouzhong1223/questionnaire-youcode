package com.youcode.questionnaire.questionnaireyoucode.service;

import com.youcode.questionnaire.questionnaireyoucode.dto.rep.RespDto;

/**
 * @Author : Gouzhong
 * @Blog : www.gouzhong1223.com
 * @Description :
 * @Date : create by QingSong in 2020-11-01 11:25
 * @Email : gouzhong1223@gmail.com
 * @Since : JDK 1.8
 * @PackageName : com.youcode.questionnaire.questionnaireyoucode.service
 * @ProjectName : questionnaire-youcode
 * @Version : 1.0.0
 */
public interface AdminUserService {
    /**
     * 管理员登录
     *
     * @param userName 管理员用户名
     * @param password 管理员密码
     * @return
     */
    RespDto adminUserLogin(String userName, String password);
}
