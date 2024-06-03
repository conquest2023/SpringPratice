package com.example.rest_api.Controller;


import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@Slf4j
@RestController
@RequestMapping("/api/b")
public class RestApiBController {

    @GetMapping("/hello")
    public  void hello(){
        throw new NumberFormatException("number format exception");
    }

    //직접 컨트롤가서 처리
/*    @ExceptionHandler(value = {NumberFormatException.class}) //글로벌하게 가지않고 해당 컨드롤러 내에서 해결
    public ResponseEntity numberFormatException(
            NumberFormatException e
    ){
        log.error("RestApiBController",e);

        return  ResponseEntity.ok().build();
    }*/


}
