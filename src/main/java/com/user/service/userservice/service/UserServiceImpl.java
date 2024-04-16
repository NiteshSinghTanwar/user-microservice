package com.user.service.userservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.user.service.userservice.entities.HotelService;
import com.user.service.userservice.entities.User;
import com.user.service.userservice.hotel.HotelServiceApi;


@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private HotelServiceApi hotelServiceApi;

	@Override
	public List<User> getAllUsers() {
		List<User> res = null;
		HotelService list = this.restTemplate.getForObject("http://localhost:8082/hotel/1", HotelService.class);
		return res;
	}

	@Override
	public HotelService getUser(Long id) {
		HotelService hotel = this.hotelServiceApi.getById(id);
		return hotel;
	}


}
