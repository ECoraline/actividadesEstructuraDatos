/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practicas;

/**
 *
 * @author bryan
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        /*
        int valores[];
        int ina;
        int inb;
        int inc;
        int a;
        int b;
        int c;
        valores = new int[3];
        ina = 0;
        inb = 1;
        inc = 2;
        a = 10;
        b = 20;
        c = 30;
        valores[ina] = a;
        valores[inb] = b;
        valores[inc] = c;
        System.out.println(valores[ina] + ", " + valores[inb] + ", " + valores[inc]);
        */
        /*
        
        estructura2
        int[] valor = {10,20,30};
        System.out.println(valor[0] + ", " + valor[1] + ", " + valor[2]);
        */
        int[] val = new int[3];
        for (int i = 0; i < val.length; i++) {
            val[i] = (i + i) * 10;
        }
    }

}
