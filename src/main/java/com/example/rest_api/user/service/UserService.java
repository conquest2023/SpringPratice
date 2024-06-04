package com.example.rest_api.user.service;


import com.example.rest_api.user.db.UserRepository;
import com.example.rest_api.user.model3.UserEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service//서비스 로직이 들어가는 빈의 영역임
 //주입받기위해
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserEntity save(UserEntity user){

        //save

        return  userRepository.save(user);

    }
    public List<UserEntity> findAll(){
        return  userRepository.findAll();
    }

    public  void delete(Long id){
        userRepository.delete(id);
    }
    public Optional<UserEntity> findById(Long id){
        return  userRepository.findById(id);
    }
}
