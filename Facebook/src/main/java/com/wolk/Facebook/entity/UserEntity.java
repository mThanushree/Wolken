package com.wolk.Facebook.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@Table
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class UserEntity {
	
	@Id
	private int id;
	private String name;
	private String email;
	private String gender;
	private String fatherName;
	private String motherName;
	private String dob;
	private long contact;
	private int height;
	
}
