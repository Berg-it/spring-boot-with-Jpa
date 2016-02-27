package tn.bergit.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.bergit.crud.entity.User;
import tn.bergit.crud.service.IUserService;

@RestController
@RequestMapping(value=UserController.PATH, produces={"application/json; charset=utf-8"})
public class UserController {
	
	protected static final String PATH = "/1.0/users";
	
	@Autowired
	IUserService gIUserService;
	
	
	@RequestMapping(value="/all")
	public List<User> allUsers(){
		return gIUserService.listUser();
	}
	
	@RequestMapping(value="/add")
	public Long addUser(){
		
		User vUser = new User();
		vUser.setFirstName("Mohamed Amine");
		vUser.setLastName("Berguiga");
		return gIUserService.createNewUser(vUser);
	}	
	
	

}
