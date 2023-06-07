package com.bamba.crm.services;

import com.bamba.crm.model.Customer;
import com.bamba.crm.model.User;
import com.bamba.crm.repository.I_UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServices implements I_UserService {

    private final I_UserRepository userRepository;

    public UserServices(I_UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User saveUser(User user){
        return userRepository.save(user);
    }

    @Override
    public void  deleteUser(Long id){
        userRepository.deleteById(id);
    }


    @Override
    public User updateUser(User user){
        return userRepository.save(user);
    }


    @Override
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }


}
