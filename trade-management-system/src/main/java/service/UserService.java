package service;

import model.User;

public interface UserService {

    /**
     * 根据id查询用户信息
     *
     * @param id
     * @return
     */
    User selectUserById(Integer id);
}
