package com.wolken.monument.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;



@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "monument_details")

public class MonumentEntity {
	
	@Id
	private int id;
	private String name;
	private String location;
	private int year;

}
