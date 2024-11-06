package com.cgs.collegegrading.service;

import com.cgs.collegegrading.model.UserModel;

public interface UserService {

    void register(UserModel userModel);

    UserModel findByUsername(String username);
}
