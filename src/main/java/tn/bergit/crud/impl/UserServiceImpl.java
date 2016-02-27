package tn.bergit.crud.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.bergit.crud.entity.User;
import tn.bergit.crud.persistence.IUserPersistence;
import tn.bergit.crud.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	IUserPersistence gIUserPersistence;
	
	@Override
	public Long createNewUser(User pUser) {
		// TODO Auto-generated method stub
		return gIUserPersistence.createNewUser(pUser);
	}

	@Override
	public List<User> listUser() {
		// TODO Auto-generated method stub
		return gIUserPersistence.listUser();
	}

}
