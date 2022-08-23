package com.nivedita.app.crud.models;
import javax.persistence.*;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column
	private String firstName;
	
	@Column
	private String lastName;
	
	@Column
	private int age;
	
	@Column
	private long phoneNumber;
	
	public long  getId()
	{
		return id;
	}
	
	public void setId(long id)
	{
		this.id = id;
	}
	
	public  String getFirstName()
	{
		return firstName;
	}
	
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	public  String getLastName()
	{
		return lastName;
	}
	
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	public int  getAge()
	{
		return age;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public long  getPhoneNumber()
	{
		return phoneNumber;
	}
	
	public void setPhoneNumber(long phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
	
	
	

}
