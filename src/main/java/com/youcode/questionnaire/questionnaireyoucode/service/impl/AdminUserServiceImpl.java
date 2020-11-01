package com.youcode.questionnaire.questionnaireyoucode.service.impl;

import com.youcode.questionnaire.questionnaireyoucode.dto.rep.RespDto;
import com.youcode.questionnaire.questionnaireyoucode.entity.AdminUser;
import com.youcode.questionnaire.questionnaireyoucode.mapper.AdminUserMapper;
import com.youcode.questionnaire.questionnaireyoucode.service.AdminUserService;
import org.jasypt.encryption.StringEncryptor;
import org.springframework.stereotype.Service;

/**
 * @Author : Gouzhong
 * @Blog : www.gouzhong1223.com
 * @Description :
 * @Date : create by QingSong in 2020-11-01 11:25
 * @Email : gouzhong1223@gmail.com
 * @Since : JDK 1.8
 * @PackageName : com.youcode.questionnaire.questionnaireyoucode.service.impl
 * @ProjectName : questionnaire-youcode
 * @Version : 1.0.0
 */
@Service
public class AdminUserServiceImpl implements AdminUserService {

    private final StringEncryptor stringEncryptor;
    private final AdminUserMapper adminUserMapper;

    public AdminUserServiceImpl(StringEncryptor stringEncryptor, AdminUserMapper adminUserMapper) {
        this.stringEncryptor = stringEncryptor;
        this.adminUserMapper = adminUserMapper;
    }

    @Override
    public RespDto adminUserLogin(String userName, String password) {
        // 去数据库里面根据用户名查询用户
        AdminUser adminUser = adminUserMapper.selectOneByUserName(userName);
        if (adminUser != null) {
            // 对比密码是否匹配
            if (stringEncryptor.decrypt(adminUser.getPassword()).equals(password)) {
                return RespDto.builder().code(200).message("登陆成功").data(adminUser).build();
            }
            return RespDto.builder().code(201).message("用户名或密码错误").build();
        }

        return RespDto.builder().code(201).message("用户不存在").build();
    }
}
