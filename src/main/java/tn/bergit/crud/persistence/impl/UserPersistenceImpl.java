package tn.bergit.crud.persistence.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import tn.bergit.crud.entity.User;
import tn.bergit.crud.persistence.IUserPersistence;

@Repository
@Transactional
public class UserPersistenceImpl implements IUserPersistence {

	@PersistenceContext
	private EntityManager entityManager;
	  
	public EntityManager getEntityManager() {
		return entityManager;
	}


	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}


	@Override
	public Long createNewUser(User pUser) {
		 
		this.getEntityManager().persist(pUser);
		return pUser.getIdUser();
	}

	
	@Override
	public List<User> listUser() {
		System.out.println("Begin Search for a list of users");
	    String queryString = "select model from " + User.class.getName() + " model";
	    System.out.println("query String is: "+queryString);
	    Query query = getEntityManager().createQuery(queryString);
		List resultList = query.getResultList();
		List<User> vList  = resultList;
		System.out.println("size list of users "+vList.size());
		return vList;
	}

}
