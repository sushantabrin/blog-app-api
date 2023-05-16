package com.abrin.blog.payloads;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {
	private int id ;
	private String name ;
	private String email ;
	private String password ;
	private String about ;
}



// User Data Transfer Object
// this class will be used to not expose the entity class
// used in UserService class
// this class have same fields as the entity class