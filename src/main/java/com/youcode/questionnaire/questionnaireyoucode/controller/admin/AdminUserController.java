package com.youcode.questionnaire.questionnaireyoucode.controller.admin;

import com.youcode.questionnaire.questionnaireyoucode.dto.rep.RespDto;
import com.youcode.questionnaire.questionnaireyoucode.service.AdminUserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : Gouzhong
 * @Blog : www.gouzhong1223.com
 * @Description :
 * @Date : create by QingSong in 2020-11-01 11:17
 * @Email : gouzhong1223@gmail.com
 * @Since : JDK 1.8
 * @PackageName : com.youcode.questionnaire.questionnaireyoucode.controller.admin
 * @ProjectName : questionnaire-youcode
 * @Version : 1.0.0
 */
@RestController
@RequestMapping("admin")
public class AdminUserController {


    private final AdminUserService adminUserService;

    public AdminUserController(AdminUserService adminUserService) {
        this.adminUserService = adminUserService;
    }

    @PostMapping("login")
    public RespDto adminUserLogin(@RequestParam("username") String userName, @RequestParam("password") String password) {
        return adminUserService.adminUserLogin(userName, password);
    }


}
