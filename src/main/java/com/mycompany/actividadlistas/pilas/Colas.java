/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividadlistas.pilas;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class Colas {

    public static void main(String[] args) {
        Queue<String> cola = new LinkedList();
        Scanner sc = new Scanner(System.in);
        boolean finalizar = true;
        do {

            int opc = 0;
            try {
                System.out.println("""
                               
                               1. Agregar un elemento
                               2.-Agregar varios elementos
                               3.-Mostrar elementos
                               4.-Mostrar el primer elemento
                               5.-Numero de elementos almacenados
                               6.-Remover elemento
                               7.-Limpiar lista
                               8.-Validar si existen elementos
                               9.-Buscar elementos
                               10.- finalizar programa
                               """);
                opc = sc.nextInt();
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("Por favor Ingrese un numero entre 1 y 10");
                sc.nextLine();
                opc = sc.nextInt();
            }

            switch (opc) {
                case 1:
                    System.out.println("Ingrese un nombre");
                    cola.add(sc.nextLine());
                    break;
                case 2:
                    System.out.println("Cuantos elementos desea agregar?");
                    int num = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < num; i++) {
                        System.out.println("Ingrese el " + (i + 1) + " nombre: ");
                        cola.add(sc.nextLine());
                    }
                    System.out.println("elementos agregados correctamente: ");
                    System.out.println(cola);
                    break;
                case 3:
                    System.out.println("elementos actuales: \n" + cola);
                    break;
                case 4:
                    System.out.println("El primer elemento de la colas es: " + cola.peek());
                    break;
                case 5:
                    System.out.println("Numero de elementos almacenados: " + cola.size());
                    break;
                case 6:
                    System.out.println("Sacar primer elemento: " + cola.poll());
                    break;
                case 7:
                    System.out.println("Limpiando la lista...");
                    cola.clear();
                    break;
                case 8:
                    if (cola.isEmpty()) {
                        System.out.println("La cola esta limpia.");
                    } else {
                        System.out.println("Existen elementos en la lista");
                    }
                    break;
                case 9:
                    System.out.println("Ingrese el elemento que desea buscar: ");
                    var busqueda = sc.nextLine();
                    if (cola.contains(busqueda)) {
                        System.out.println("el elemento si se encuentra en la cola");
                    } else {
                        System.out.println("El elemento no se encuentra en la cola");
                    }
                    break;
                case 10:
                    System.out.println("Saliendo...");
                    finalizar = true;
                default:
                    System.out.println("Por favor elija una opcion del menú");

            }
        } while (finalizar);
    }

}
