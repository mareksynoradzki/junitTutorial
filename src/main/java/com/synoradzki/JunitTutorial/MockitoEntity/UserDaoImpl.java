package com.synoradzki.JunitTutorial.MockitoEntity;

public class UserDaoImpl extends GenericDaoImpl<User>{

	public void sysout(String param){
		System.out.println(param + " " + param);
	}
}
