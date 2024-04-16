package com.user.service.userservice.service;

import com.user.service.userservice.entities.HotelService;
import com.user.service.userservice.entities.User;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface UserService {

    List<User> getAllUsers();

    HotelService getUser(Long id);
}
