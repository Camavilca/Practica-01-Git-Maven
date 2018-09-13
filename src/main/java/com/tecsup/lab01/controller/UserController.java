package com.tecsup.lab01.controller;
import com.tecsup.lab01.model.User;
public class UserController {
	User obj =  new User();
	
	
	public String nombre(String nombre) {
		obj.setNombre(nombre);
		return "El nombre es:\t"+obj.getNombre();
	}
	public String apellido(String apellido) {
		obj.setApellido(apellido);
		return "El nombre es:\t"+obj.getApellido();
	}
	public String edad(int edad) {
		obj.setEdad(edad);
		return "El nombre es:\t"+obj.getEdad();
	}
}
