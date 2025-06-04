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
public class pila_objeto {
    public static void main(String[] args) {
        Stack<Producto> carrito = new Stack<>();
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Cuantos productos desea comprar?: ");
        int num = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < num; i++) {
            System.out.println("ingrese el nombre del producto " + (i+1));
            String nombre = sc.nextLine();
            System.out.println("ingrese el codigo del producto: ");
            String codigo = sc.nextLine();
            System.out.println("Ingrese la cantidad de " + nombre + " que desea comprar: ");
            int cantidad = sc.nextInt();
            System.out.println("Ingrese el precio unitario del producto: ");
            double precio = sc.nextDouble();
            Producto p1 = new Producto(nombre, codigo, cantidad, precio);
            carrito.add(p1);
            sc.nextLine();
        }
        
        
        System.out.println("los productos que estan en su carrito son:");
        double total = 0;
        for (Producto prod : carrito) {
            System.out.println(prod);
            total += (prod.cantidad*prod.precio_unitario);
        }
        System.out.println("El costo total de sus productos es: " + total);
        
        System.out.println("desea buscar la informacion de algun producto especifico? (1-si/ 2-no)");
        int buscar = sc.nextInt();
        if (buscar == 1) {
            System.out.println("""
                               cual es el nombre del producto que desea buscar?
                                **********(debe escribir el nombre exacto)*******
                               :""");
            sc.nextLine();
            String nombreBusqueda = sc.nextLine();
            Producto resultado = buscar(carrito,nombreBusqueda);
            if (resultado.nombre.equalsIgnoreCase(nombreBusqueda)) {
                System.out.println("Datos del producto: ");
                System.out.println(resultado);
            }else{
                System.out.println("producto no encontrado, escriba el nombre correcto");
            }
        }
        System.out.println("Pase a caja para pagar y recibir sus productos, tenga un buen dia");
    }
    public static Producto buscar (Stack<Producto> carrito, String buscado){
        for (Producto producto : carrito) {
            if (producto.nombre.equalsIgnoreCase(buscado)) {
                return producto;
            }else{
                return null;
            }
        }
        return null;
    }
    
}
