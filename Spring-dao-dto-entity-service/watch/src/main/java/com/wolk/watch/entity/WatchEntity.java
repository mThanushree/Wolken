package com.wolk.watch.entity;

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
@Table(name="watch")
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class WatchEntity {
	@Id
	private int id;
	private String appName;
	private byte rating;
	private short size;
	private String type;
}