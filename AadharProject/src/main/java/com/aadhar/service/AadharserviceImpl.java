package com.aadhar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aadhar.model.UserInfo;
import com.aadhar.repository.AadharRepository;

@Service
public class AadharserviceImpl implements Aadharservice {

	@Autowired
	AadharRepository aadharRepository;

	@Override
	public List<UserInfo> getalluserdata() {
		// TODO Auto-generated method stub
		return null;
	}

	//save data in database
	@Override
	public void saveUserData(UserInfo userInfo) {
		this.aadharRepository.save(userInfo);
		
	}
	
	
}
