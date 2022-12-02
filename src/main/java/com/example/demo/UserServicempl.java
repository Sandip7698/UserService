package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class UserServicempl implements UserService{
//fake data
	
	List<User> list=List.of(
			new User(1211L,"Sandip","7720895384"),
			new User(1221L,"Nikhil","7720895387"),
			new User(1231L,"Shubham","7720895390"),
			new User(1241L,"Shreyas","7720895388")
			);
	@Override
	public User getUser(Long id) {
		// TODO Auto-generated method stub
		return this.list.stream().filter(user->user.getUserId().equals(id)).findAny().orElse(null) ;
	}

}
