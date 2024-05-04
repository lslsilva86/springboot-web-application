package com.saneerasilva.springboot.webapplication.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public boolean authenticate(String username, String password) {
		boolean isValidUserName = username.equalsIgnoreCase("abc");
		boolean isValidPassword = username.equalsIgnoreCase("abc");
		
		return isValidUserName && isValidPassword;
	}

}
