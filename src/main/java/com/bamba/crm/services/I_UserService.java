package com.bamba.crm.services;


import com.bamba.crm.model.Customer;
import com.bamba.crm.model.User;

import java.util.List;

public interface I_UserService {
    User saveUser(User user);

    void  deleteUser(Long id);

    User updateUser(User user);

    List<User> getAllUsers();
}
