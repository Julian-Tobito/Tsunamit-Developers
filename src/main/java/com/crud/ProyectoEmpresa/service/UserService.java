package com.crud.ProyectoEmpresa.service;

import com.crud.ProyectoEmpresa.model.User;
import com.crud.ProyectoEmpresa.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserService {
    private UserRepository userRepository;

    private UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    public User saveUser(Map<String,Object> dataUser){
        User user = userRepository.findByEmail((String) dataUser.get("email"));

        if(user==null){
            String name = (String) dataUser.get("nickname");
            String email = (String) dataUser.get("email");
            String image = (String) dataUser.get("picture");
            String authId = (String) dataUser.get("sub");


            User newUser = new User(name, email,image,authId);
            userRepository.save( newUser);
            return  newUser;
        }

        return null;
    }

}