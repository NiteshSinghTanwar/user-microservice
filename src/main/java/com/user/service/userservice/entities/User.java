package com.user.service.userservice.entities;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data
public class User {

	private Long id;
    private String name;
    private String email;
    private String mobileNum;

    public User(Long id, String name, String email, String mobileNum) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobileNum = mobileNum;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNum() {
		return mobileNum;
	}

	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}
    
    


}
