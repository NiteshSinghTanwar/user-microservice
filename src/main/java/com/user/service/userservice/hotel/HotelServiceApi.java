package com.user.service.userservice.hotel;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.user.service.userservice.entities.HotelService;

@Service
@FeignClient(name="HOTEL-SERVICE", url = "http://localhost:8082/hotel")
public interface HotelServiceApi {

	@GetMapping(value = "/{id}", consumes = "application/x-www-form-urlencoded")
	HotelService getById(@PathVariable Long id);
}
