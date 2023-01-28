package com.yjptechie.springbootlogin.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.yjptechie.springbootlogin.controller.dto.UserRegistrationDto;
import com.yjptechie.springbootlogin.model.User;

public interface UserService extends UserDetailsService{
	
	public User save(UserRegistrationDto registrationDto);
}
