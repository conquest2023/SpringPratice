package com.example.rest_api.user.controller3;


import com.example.rest_api.model2.UserResponse;
import com.example.rest_api.user.model3.UserEntity;
import com.example.rest_api.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //httprequest 처리 response 응답
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserApiController3 {

    private  final UserService userService;
    @PutMapping("")
    public UserEntity craete(
        @RequestBody UserEntity userEntity
    ){
            return  userService.save(userEntity);
    }
    @GetMapping("/all")
    public List<UserEntity> findAll(){
        return  userService.findAll();


    }
    @DeleteMapping("/id/{id}")
    public  void delete(
            @PathVariable Long id

    ){
        userService.delete(id);

    }

    @GetMapping("/id/{id}")
    public  UserEntity findOne(
            @PathVariable Long id
    ){
        var response=userService.findById(id);
        return  response.get();
    }

}
