package com.example.rest_api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.catalina.User;

@Setter
@AllArgsConstructor//생성자 메서드의 모든것을 담을수있음
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class UserRequest {

    //JsonProperty로 특정한 이름 가능함
    private  String userName;
    private  Integer userAge;
    private  String email;
    private  boolean isKorean; //default false  is는 boolean 에 관한거여서 뺴줘야함
//직렬화 ObejctMapper는 직렬화를 해줄때 변수 기준이아닌 get이라는 이름이 들어간 메서드들을 참고

  /*  public  String getName(){
        return  this.userName;
    }
    public  int getHumanAge(){
        return  this.userAge;
    }*/

//    public void setUserNames(String name){
//        this.userName=name;
//    } 특정한 이름으로 지을수있음
    }

