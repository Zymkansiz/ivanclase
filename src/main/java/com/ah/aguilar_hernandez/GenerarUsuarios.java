
package com.ah.aguilar_hernandez;

import java.util.ArrayList;


public class GenerarUsuarios {
    public static ArrayList<Usuario> obtenerUsuarios(){ 
        ArrayList<Usuario> usuarios=new ArrayList<Usuario>();
               
        //creamos 3 direcciones
        Direccion d1=new Direccion("Calle de la muerte", 55090, "Azteca", "Mexico");
        Direccion d2=new Direccion("Calle de la amargura", 55180, "Cuajimalpa", "Chihuahua");
        Direccion d3=new Direccion("Heraldos", 55789, "Xochimilco", "Chiapas");
        Direccion d4=new Direccion("Calle de la muerte", 55791, "Zapotecas", "Tijuana");
        
        //asignamos direcciones a los usuarios
        Usuario u1=new Usuario("Ivan",26,150000,d1);
        Usuario u2=new Usuario("Josue",35,60000,d2);
        Usuario u3=new Usuario("Mariel",29,15000,d3);
        Usuario u4=new Usuario("Carmen",34,60000,d4);
        
        usuarios.add(u1);
        usuarios.add(u2);
        usuarios.add(u3);
        usuarios.add(u4);
        
        return usuarios;
    }
}
