package com.cgs.collegegrading.service;


import com.cgs.collegegrading.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserModel userModel = userService.findByUsername(username);
        if(userModel == null) {
            return null;
        }
        return User.builder()
                .username(userModel.getUsername())
                .password(userModel.getPassword())
                .roles(userModel.getRole().name())
                .build();
    }
}
