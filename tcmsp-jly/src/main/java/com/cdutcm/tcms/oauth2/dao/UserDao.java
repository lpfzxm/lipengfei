package com.cdutcm.tcms.oauth2.dao;



import java.util.List;

import com.cdutcm.tcms.oauth2.entity.User;

public interface UserDao {

    public User createUser(User user);

    public User updateUser(User user);

    public void deleteUser(Long userId);

    User findOne(Long userId);

    List<User> findAll();

    User findByUsername(String username);

}
