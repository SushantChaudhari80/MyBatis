package com.example.sushant.Endpoint;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sushant.Mapper.UserMapper;
import com.example.sushant.Model.Users;


@RestController
public class UserController {
    
	@Autowired
	UserMapper mapper;
	
	@GetMapping("/findAll")
	public List<Users> findAll(){
		return mapper.findAll();
	}
	@GetMapping("/insert")
	public List<Users> insert(){
		Users user =new Users("ASHIBHA","Abhishek Bhapker","Ahmednagar");
		mapper.insert(user);
	
		return mapper.findAll();
	}
}
