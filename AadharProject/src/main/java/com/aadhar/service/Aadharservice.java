package com.aadhar.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.aadhar.model.UserInfo;


public interface Aadharservice {
	
	List<UserInfo> getalluserdata();
	
	// save userdata 
	void saveUserData(UserInfo userInfo);
	
	
}
