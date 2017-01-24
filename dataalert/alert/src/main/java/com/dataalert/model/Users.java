package com.dataalert.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Users {
@Id@GeneratedValue
private int userId;
private String username;
private String createpassword;

private String confirmpassword;

private String emailId;

private long Mobile;
private boolean enabled;
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}


public long getMobile() {
	return Mobile;
}
public void setMobile(long mobile) {
	Mobile = mobile;
}

public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getCreatepassword() {
	return createpassword;
}
public void setCreatepassword(String createpassword) {
	this.createpassword = createpassword;
}
public String getConfirmpassword() {
	return confirmpassword;
}
public void setConfirmpassword(String confirmpassword) {
	this.confirmpassword = confirmpassword;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}public boolean isEnabled() {
	return enabled;
}
public void setEnabled(boolean enabled) {
	this.enabled = enabled;
}



}
