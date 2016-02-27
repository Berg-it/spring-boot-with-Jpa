package tn.bergit.crud.service;

import java.util.List;

import tn.bergit.crud.entity.User;

public interface IUserService {
	
	public List<User> listUser();
	public Long createNewUser(User pUser);

}
