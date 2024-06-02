package com.example.rest_api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RequestParam;

@Data //lombok 자동으로 get Set 메서드들이 만들어진다.
@AllArgsConstructor //전체 파라미터가 들어간 어노테이션
@NoArgsConstructor // 파라미터를 받지않는 기본 생성자
public class BookQueryParam {
   //카멜 케이스로 가는게 편함

   private String category;
   private String issuedYear;
   private String issuedMonth;
   private String issue_day;


}
