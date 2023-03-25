/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista;

/**
 *
 * @author Usuario
 */
public class Nodo {
    
    int dato;
    
    Nodo enlace;
    
    public Nodo (int x){
    dato = x;
    enlace=null;
    }
    
    public Nodo(int x, Nodo n){
    dato=x;
    enlace=n;
    }
    
    public int GetDato(){
    return dato;
    }
    
    public Nodo GetEnlace(){
    return enlace;
    }
    
    public void setEnlace (Nodo n){
    this.enlace =n;
    }
    
    public void setDato(int x){
    this.dato = x;
    }
}
