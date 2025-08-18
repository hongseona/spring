package org.iclass.spring_5webmvc.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TestDto {
    private String name;
    private int age;
    private String address;
    private String gender;

    // 생성자, getter, setter, toString() 메소드 자동 생성
    // Lombok 라이브러리 사용
}
