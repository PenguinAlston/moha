package com.moha.users.controller;

import com.moha.common.ResponseVO;
import com.moha.entities.UsersInfo;
import com.moha.dubboApi.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName: UserInfoController
 * @Description: TODO
 * @Author: shao1
 * @Version: 1.0
 **/
@RestController
@RequestMapping("/users")
public class UserInfoController {

    @Autowired
    private UsersService usersService;

    @GetMapping("/getAll")
    public ResponseVO getAllUsers(){
        ResponseVO responseVO = new ResponseVO();
        List<UsersInfo> allUsersInfo = usersService.getAllUsersInfo();
        if(allUsersInfo.size()>0){
            return responseVO.ok(allUsersInfo);
        }
        return responseVO.fail();
    }
}
