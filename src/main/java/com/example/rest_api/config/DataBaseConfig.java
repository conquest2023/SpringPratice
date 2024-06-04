package com.example.rest_api.config;


import com.example.rest_api.user.db.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
//설정 , 스프링 앱이 실행될때 configuration이라는 것을찾아서 특정한 내용들을 통해 객체 생성
public class DataBaseConfig {

    @Bean
    public UserRepository userRepository(){
        return  new UserRepository();
    }
}

