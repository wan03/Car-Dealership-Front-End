package com.revature.service;

import com.revature.domain.User;

public interface AuthenticationService {
	
	public User validateUser(String username, String password);

}
