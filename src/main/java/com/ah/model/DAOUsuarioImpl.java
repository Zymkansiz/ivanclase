/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ah.model;

import com.ah.aguilar_hernandez.HibernateUtilidades;
import com.ah.aguilar_hernandez.Usuario;
import java.util.ArrayList;
import javax.transaction.Transaction;
import javax.websocket.Session;
import org.codehaus.jackson.map.ObjectMapper;


/**
 *
 * @author T107
 */
public class DAOUsuarioImpl {
    
    public String obtenerTodos() throw Exception{
        SessionFactory factory= HibernateUtilidades.getSessionFactory();
        Session sesion= factory.openSession();
        Transaction tranza= sesion.beginTransaction();
        
       Criteria cri=sesion.createCreiteria(Usuario.class);
       ArrayList<Usuario>usuario=(ArrayList<Usuario>)cri.list();
       //System.Out.println(usuarios.get(0)
       
       ObjectMapper mapper= new ObjectMapper();
       
       tranza.commit();
       sesion.close();
       
       return mapper.writeValueAsString(usuarios);
    }
    
}
