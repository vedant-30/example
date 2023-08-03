package com.pharmacystore.dao;

import com.pharmacystore.pojo.User;

public interface UserDAO {

	boolean register(User user);
	boolean checkUser(User user);
}
