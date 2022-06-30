package com.example.sushant;

import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.sushant.Model.Users;
@MappedTypes(Users.class)
@MapperScan("com.example.sushant.Mapper")
@SpringBootApplication
public class MyBatisProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyBatisProjectApplication.class, args);
	}

}
