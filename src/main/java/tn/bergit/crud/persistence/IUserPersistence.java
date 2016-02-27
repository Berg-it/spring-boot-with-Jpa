package tn.bergit.crud.persistence;

import java.util.List;

import tn.bergit.crud.entity.User;

public interface IUserPersistence {
	
	public List<User> listUser();
	
	public Long createNewUser(User pUser);

}
