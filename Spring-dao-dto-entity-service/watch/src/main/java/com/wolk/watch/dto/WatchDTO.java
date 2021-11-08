package com.wolk.watch.dto;

import javax.persistence.Id;

import lombok.Data;

@Data

public class WatchDTO  {
	
	private int id;
	private String appName;
	private byte rating;
	private short size;
	private String type;
}