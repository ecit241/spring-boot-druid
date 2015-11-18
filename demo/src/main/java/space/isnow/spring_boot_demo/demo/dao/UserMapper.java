package space.isnow.spring_boot_demo.demo.dao;


import space.isnow.spring_boot_demo.demo.domain.User;

import java.util.List;

/**
 * Created by zl on 2015/8/27.
 */
public interface UserMapper {
    public List<User> findUserInfo();
}
