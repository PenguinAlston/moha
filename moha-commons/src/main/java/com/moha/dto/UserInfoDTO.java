package com.moha.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName: UserInfoDTO
 * @Description: usersinfo dto
 * @Author: shao1
 * @Version: 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfoDTO {
    private String userId;
    private String username;
    private String email;
    private String phone;
    private String kindleEmail;

}
