/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ah.aguilar_hernandez;

/**
 *
 * @author T107
 */
public class Cuadrado implements Superficie{
    private int lado;
    
    public Cuadrado (int lado){
        this.lado = lado;
    }
    
    Cuadrado (){
}

    public int getLado(){
        return lado;
    }
    
    public void setLado (int lado){
        this.lado = lado;
        
    }
}