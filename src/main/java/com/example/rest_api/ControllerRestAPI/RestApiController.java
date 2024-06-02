package com.example.rest_api.ControllerRestAPI;


import com.example.rest_api.model.BookQueryParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
//spring boot 어노테이션 기반

@Slf4j
@RestController//RestApi를 처리하는 컨드롤러
@RequestMapping("/api")//어떠한 주소를 처리겠다
public class RestApiController {

    @GetMapping(path = "/hello")
    public  String hello(){
        //http://localhost:8080/api/hello
        //결국엔 서버로 전달되는건 문자
        return "hello Spring Boot";

    }


    @GetMapping(path = "/echo/{message}/age/{age}/is-man/{isMan}")
    public  String echo(    //해당되는 값을 문자로 파싱
      //  @PathVariable String message  //중괄호와 같은 이름으로 설정
          @PathVariable(name = "message") String msg,
          @PathVariable int age,
          @PathVariable boolean isMan
    ){
        System.out.println("echo message:"+msg);
        System.out.println("age = " + age);
        System.out.println("isMan = " + isMan);


        return msg.toUpperCase();
    }
    //http://localhost:8080/api/book2?category=IT&issuedYear=2023&issued-month=01&issue_day=31
    @GetMapping(path = "/book")
    public void queryParam(
         @RequestParam String category,
         @RequestParam String issuedYear,
         @RequestParam(name = "issued-month") String issuedMonth,
         @RequestParam String issue_day

         //변수명이 동일하면 동일한 값으로 들어옴
    ){
        System.out.println("category = " + category);
        System.out.println("issuedYear = " + issuedYear);
        System.out.println("issuedMonth = " + issuedMonth);
        System.out.println("issue_day = " + issue_day);
    }
    @GetMapping(path = "/book2")
    public void queryParamDto(
            BookQueryParam bookQueryParam //이렇게 설정하면 한번에 받는게 불가능함
    ){
        System.out.println("bookQueryParam = " + bookQueryParam);
    }


    //TODO Parameter 2가지를 받습니다,int 형태로 받아서 두 수의 덧셈, 곱셈
    @GetMapping(path = "/book3")
    public  int Cacularate(
            @RequestParam int num1,
            @RequestParam int num2
    ){


        return  num1+num2;
    }

    @DeleteMapping(path={"/user/{userName}/delete",
            "/user/{userName}/del"}) //여러가지 매핑 가능
    public  void delete(
    @PathVariable String userName
    ){
        log.info("user-name:{}",userName);
    }
}

