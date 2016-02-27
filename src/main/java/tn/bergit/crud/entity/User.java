package tn.bergit.crud.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_example")
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2248190721476487645L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long   idUser;
	private String firstName;
	private String lastName;
	public Long getIdUser() {
		return idUser;
	}
	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Long idUser, String firstName, String lastName) {
		super();
		this.idUser = idUser;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	
	
}
