package com.example.sushant.Endpoint;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
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
	public String insert(){
		try {
		Users user =new Users("ASHIBHA","Abhishek Bhapker","Ahmednagar");
		mapper.insert(user);
		return "Data Inserted Successfully..";
		}catch(Exception e) {
			return "BackEnd Problem"+e;
		}

	}  
	@GetMapping("update")
	public String update() {
		try {
			Users user =new Users("ASHIBHA","Abhishek Jadhav","Pune");
			mapper.update(user);
			return "Data Updates Successfully";
		}catch(Exception e) {
			return "BackEnd problem"+e;
		}
	}
	
	
	@DeleteMapping("/delete")
	public String delete() {
		try {
			String id="ASHIBHA";
			mapper.delete(id);
			return "Data deleted  Successfully";
		}catch(Exception e) {
			return "BackEnd problem : "+e;
		}
	}
}
