package com.fenoreste.rest.Dao;

public class UsuarioDao {

	
	  public static boolean validar(String username,String password) {
		  
		  return (username.equals("admin") && password.equals("admin"));
	  }
	  
	
	     
}
