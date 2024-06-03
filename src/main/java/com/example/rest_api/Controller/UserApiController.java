package com.example.rest_api.Controller;


import com.example.rest_api.model2.Api;
import com.example.rest_api.model2.UserResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/user")


public class UserApiController {
    //builder 해당 객체를 만든다
    private  static List<UserResponse> userList=List.of(
            UserResponse.builder().id("1")
                    .age(20)
                    .name("홍길동")
                    .build()
            ,
            UserResponse.builder().id("2")
                    .age(30)
                    .name("홍길동22")
                    .build()
    );
    @GetMapping("/id/{userId}")
    public Api<UserResponse>getUser(
            @PathVariable String userId
    ){

        var user=userList.stream().filter(
                it->it.getId().equals(userId)
                )
                .findFirst()        //값을 가져옴
                .get();

        Api<UserResponse> response=Api.<UserResponse>builder()
                .resultCode(String.valueOf(HttpStatus.OK.value()))
                .resultMessage(HttpStatus.OK.name())
                .data(user)
                .build();
        return  response;
    }
}
