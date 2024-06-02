package com.example.rest_api.ControllerRestAPI;

import com.example.rest_api.model.BookRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PostApiController {


    @PostMapping("/post")
    public BookRequest post(
            @RequestBody BookRequest bookRequest
            //post또는 put방식에서 Http Body로 들어오는 데이터를 해당 객체에 매핑

            ){
        System.out.println("bookRequest = " + bookRequest);
        return bookRequest; //Json 반환, toString ==문자열 반환

    }
}
