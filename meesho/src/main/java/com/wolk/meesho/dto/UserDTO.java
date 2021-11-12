package com.wolk.meesho.dto;

import lombok.Data;

@Data

public class UserDTO {
	
	private int id;
	private String username;
	private String email;
	private String password;
	private String cnfpassword;
	private long contactNumber;
	
}