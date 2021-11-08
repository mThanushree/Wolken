package com.wolk.games.dto;

import lombok.Data;

@Data

public class GamesDTO {
	
	private int id;
	private String countryName;
	private int position;
	private int gold;
	private int silver;
	private int bronze;
}