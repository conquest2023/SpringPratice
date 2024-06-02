package com.example.rest_api.ControllerRestAPI;


import com.example.rest_api.model.UserRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api")
public class PutApiController {

    @PutMapping("/put")
    public  void put(
            @RequestBody UserRequest userRequest
            ){
        //System.out.println();  sys<log 속도가 월등히 빠름 log가 버퍼를 가지고 있기때문에
        log.info("Request:{}",userRequest);
    }
}
