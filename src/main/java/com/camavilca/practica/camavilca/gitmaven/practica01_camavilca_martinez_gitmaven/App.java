package com.camavilca.practica.camavilca.gitmaven.practica01_camavilca_martinez_gitmaven;

import javax.swing.JOptionPane;
import  com.tecsup.lab01.controller.UserController;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	UserController obj =  new UserController();
    	String nom = JOptionPane.showInputDialog("Ingrese su nombre : ");
    	String ape = JOptionPane.showInputDialog("Ingrese su apellido : ");
    	int ed = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su nombre : "));
    	System.out.println(obj.nombre(nom));
    	System.out.println(obj.apellido(ape));
    	System.out.println(obj.edad(ed));
    }
}

