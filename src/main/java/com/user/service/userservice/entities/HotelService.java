package com.user.service.userservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class HotelService {
	
	private Long id;
    private String name;
    private String email;
    private String mobileNum;
    private String location;
    

}
