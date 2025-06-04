/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividadlistas.pilas;

/**
 *
 * @author bryan
 * 
 * nombre producto
 * codigo  del producto
 * precio
 * cantidad
 * precio unitario
 */
public class Producto {
    public String nombre;
    public String codigo;
    public int cantidad;
    public double precio_unitario;

    public Producto() {
    }
    

    public Producto(String nombre, String codigo, int cantidad, double precio_unitario) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.precio_unitario = precio_unitario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    @Override
    public String toString() {
        return "[" + "nombre:" + nombre + 
                ", codigo:" + codigo + 
                ", cantidad: " + cantidad + 
                ", precio_unitario=" + precio_unitario + ']';
    }
    
    
}
