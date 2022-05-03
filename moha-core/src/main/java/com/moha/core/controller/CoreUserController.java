package com.moha.core.controller;

import com.moha.common.ResponseVO;
import com.moha.dto.UserInfoDTO;
import com.moha.dubboApi.CoreUsersServce;
import com.moha.entities.UsersInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName: CoreApplication
 * @Description: 核心入口类开始进行消息的处理
 * @Author: shao1
 * @Version: 1.0
 **/
@RestController
@RequestMapping("/core")
public class CoreUserController {

    @Autowired
    private CoreUsersServce coreUsersServce;

    @PostMapping("/login")
    public ResponseVO login(@RequestParam("username") String username, @RequestParam("password") String password){
        //
        if(!StringUtils.hasLength(username)){
            return new ResponseVO().fail("用户名不能为空");
        }
        if(!StringUtils.hasText(password)){
            return new ResponseVO().fail("用户名不能为空");
        }
        UsersInfo usersInfo = coreUsersServce.login(username, password);
        UserInfoDTO userInfoDTO = new UserInfoDTO();
        BeanUtils.copyProperties(usersInfo,userInfoDTO);

        return new ResponseVO().ok(userInfoDTO) ;

    }

    @PostMapping("/regist")
    public ResponseVO userRegiste(@RequestBody UserInfoDTO userInfoDTO){

        //userinfodto transfer to usersinfo entity
        UsersInfo info = new UsersInfo();
        BeanUtils.copyProperties(userInfoDTO,info);

        UsersInfo usersInfo = coreUsersServce.register(info);
        UserInfoDTO dto = new UserInfoDTO();
        BeanUtils.copyProperties(usersInfo,dto);

        return new ResponseVO().ok(dto);
    }
}
