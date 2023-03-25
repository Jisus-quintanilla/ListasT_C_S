/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reproductor;

import Lista.Nodo;
import reproductor.Cancion;

/**
 *
 * @author Usuario
 */
public class NodoMusic {
    
    Cancion dato;
    
    NodoMusic enlace;
    
    public NodoMusic (Cancion x){
    dato = x;
    enlace=null;
    }
    
    public NodoMusic(Cancion x, NodoMusic n){
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
