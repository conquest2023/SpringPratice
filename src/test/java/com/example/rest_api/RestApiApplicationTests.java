package com.example.rest_api;

import com.example.rest_api.model.UserRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.catalina.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RestApiApplicationTests {


	@Autowired
	private ObjectMapper objectMapper;

	@Test
	void contextLoads() throws JsonProcessingException {
			//var user=new UserRequest("홍길동",10,"hong@gmail.com",true);
			//user.setUserName("홍길동");
			//user.setUserAge(10);
			//user.setEmail("hong@gmail.com");
			//user.setKorean(true);

			var json= "{\"user_names\":\"홍길동\",\"user_age\":10,\"email\":\"hong@gmail.com\",\"is_korean\":true}";
			System.out.println("json = " + json);

			var dto=objectMapper.readValue(json,UserRequest.class);
			System.out.println("dto = " + dto);


	}

}
