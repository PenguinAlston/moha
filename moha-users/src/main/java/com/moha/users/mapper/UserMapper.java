package com.moha.users.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.moha.entities.UsersInfo;
import org.springframework.stereotype.Repository;

/**
 * @ClassName: UserMapper
 * @Description: TODO
 * @Author: shao1
 * @Version: 1.0
 **/
@Repository
public interface UserMapper extends BaseMapper<UsersInfo> {
}
