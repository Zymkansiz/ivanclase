/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ah.aguilar_hernandez;

import java.util.HashSet;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;



/**
 *
 * @author T107
 */
public class ProbarUsuarioDireccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  SessionFactory factory= HibernateUtilidades.getSessionFactory();
      Session sesion= factory.openSession();
      Transaction tranza= sesion.beginTransaction();
      
      Usuario u=new Usuario();
      Direccion d=new Direccion();
      
      d.setCalle("calle de la amargura");
      d.setColonia("Colonia de avon");
      d.setCp(55130);
      d.setEstado("Ebriedad");
      //importante ligar al usuario anterior esta direccion
      d.setIdUsuario(u);
      
      u.setDireccion(d);
      u.setEdad(26);
      u.setNombre("Ivan Aguilar");
      u.setSueldo(40002f);
      
      sesion.save(u);
      sesion.save(d);
      
      tranza.commit();
      sesion.close();
      System.out.println("todo se guardo correctamente");
        
        
        
    }
    
}
