/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reproductor;

import Lista.Lista;
import Lista.Nodo;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ListaCancion {
    public Nodo primero;
    
    private int leerEntero(){
    System.out.println("Ingrese valor, -1 para terminar");
    return Integer.parseInt(new Scanner(System.in).nextLine());    
    }
    
    public Lista CancionLista(){
    int x=0;
    primero = null;
    do{
        x=leerEntero();
        if(x !=-1){
        primero= new Nodo (x,primero);
        }
    }while (x !=-1);
    return this;
    }
}
