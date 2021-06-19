package com.aadhar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aadhar.model.UserInfo;

public interface AadharRepository  extends JpaRepository<UserInfo, Long>{

}
