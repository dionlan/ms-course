package com.dionlan.hroauth.entities;

import java.io.Serializable;

import lombok.Data;

@Data
public class Role implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String roleName;
}
