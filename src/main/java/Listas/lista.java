/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;

import java.util.ArrayList;

/**
 *
 * @author bryan
 */
public class lista {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(2);
        lista.add(4);
        lista.add(8);
        //agrega en la posicion 3
        lista.add(2,6);
        ArrayList<Integer> extra = new ArrayList<>();
        extra.add(10);
        extra.add(12);
        extra.add(14);
        extra.add(10);
        lista.addAll(extra);
        System.out.println("elemento en la posicion 3: " + lista.get(3));
        for (Integer integer : lista) {
            System.out.println(integer);
        }
        //sustituir elemento
        lista.set(2,20);
        System.out.println("se remplaza la posicion 2 por el 20: " + lista);
        //eliminar un elemento
        lista.remove(1);
        System.out.println("Se remueve el valor 4: " + lista);
        //vaciar lista
        lista.clear();
        System.out.println("lista limpia : " + lista);
        
        //tamañi de la lista
        System.out.println(lista.size());
        //comprobar si esta vacia
        System.out.println("Lista vacia? " + lista.isEmpty());
        //validar si un elemento se encuentra en la lista
        System.out.println("el numero 14 se encuentra en la lista? " + lista.contains(14));
        
    }
    
}
