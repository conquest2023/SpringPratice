package com.example.rest_api.Controller;


import com.example.rest_api.model.UserRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@Controller
@RestController //응답값을 Json으로 보내겠다
@RequestMapping("/api/v1")
//path="",method=RequestMethod.get 지정을 안하면 get Post Put 다 가능함 꼭 설정해줘야함
public class ResponseApiController {
   /* public UserRequest userRequest;
    //http:localhost:8080/api/v1
    @GetMapping("")
    @ResponseBody //Controller로 지정하면 @ResponseBody를 꼭해줘야함
    public UserRequest user(){

        var user=new UserRequest();
        user.setUserName("홍길동");
        user.setUserAge(10);
        user.setEmail("hong@gmail,com");
        log.info("user:{}",user);
        var response=ResponseEntity.status(HttpStatus.OK)
                     .header("x-custom","hi")
                    .body(user);

        return  user;

        //UserRequest Object로 리턴

        //String text로 리턴*/
    }

