package com.example.sushant.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.sushant.Model.Users;

@Mapper
public interface UserMapper {

	@Select("select * from user")
	List<Users> findAll();
	
	@Insert("insert into users values(#{id},#{name},#{address})")
	void insert(Users user);
}
