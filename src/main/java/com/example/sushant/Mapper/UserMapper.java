package com.example.sushant.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.sushant.Model.Users;

@Mapper
public interface UserMapper {

	@Select("select * from user")
	List<Users> findAll();
	
	@Insert("insert into users values(#{id},#{name},#{address})")
	void insert(Users user);
	
	@Update("update users set name=#{name},address=#{address} where id=#{id}")
	void update(Users uers);
	
	@Delete("delete from users where id=#{id}")
	void delete(String id);
}
