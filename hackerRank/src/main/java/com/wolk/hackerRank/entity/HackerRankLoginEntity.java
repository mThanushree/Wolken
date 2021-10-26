package com.wolk.hackerRank.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@Table(name="userentity")
@ToString
@NoArgsConstructor
@AllArgsConstructor
@NamedQueries({
	@NamedQuery(name="getByEmail", query="from LoginEntity where email=:email"),
	@NamedQuery(name="updatePassword",query="update LoginEntity set password=:password where email=:email")
})

public class HackerRankLoginEntity {
	@Id
	private String email;
	private String password;
}

