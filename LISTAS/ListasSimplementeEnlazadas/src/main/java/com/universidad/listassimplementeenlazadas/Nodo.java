/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.universidad.listassimplementeenlazadas;

/**
 *
 * @author DanielMancilla 98
 */
public class Nodo {
    
    int dato; //almacena el valor del nodo
    Nodo siguiente; //referencia al siguiente nodo de la lista
    
    //constructor para crear un nuevo nodo con el valor proporcionado
    public Nodo(int dato){
        this.dato = dato;
        this.siguiente = null; //inicializa el siguiente nodo como nulo
    }
    
}