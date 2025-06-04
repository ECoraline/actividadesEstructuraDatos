/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividadlistas.pilas;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author bryan
 */
public class Pila {
    public static void main(String[] args) {
        Stack<String> pila = new Stack<>();
        Scanner sc = new Scanner(System.in);
        
        pila.add("SANDIA");
        pila.add("PERA");
        pila.add("MANZANA");
        pila.add("MANGO");
        pila.add("PLATANO");
        
        System.out.println("Elemento extraido: " + pila.pop());
        System.out.println("Ultimo elemento: " + pila.peek());
        System.out.println(pila);
        
        for (String n : pila) {
            System.out.println("fruta: " + n);
        }
        
        pila.push("Guayaba");
        System.out.println(pila);
       
        Stack<Integer> precio = new Stack<>();
        
        int cantidad[] = new int[4];
        
        precio.add(cantidad[0]=15);
        precio.add(cantidad[1]=25);
        precio.add(cantidad[2]=35);
        precio.add(cantidad[3]=45);
        
        var total = 0;
        for (int i = 0; i < precio.size(); i++) {
            total += precio.get(i);
        }
        System.out.println("Total: " + total);
        
    }
}
