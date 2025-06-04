/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.actividadlistas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class ActividadListas {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String usuarioRfc = "AUFB001410";
        String contrar = "20001014";
        boolean login = true;
        do {
            System.out.println("Bienvenido al sistema,  por favor ingrese su rfc: ");
            String user = sc.next();
            System.out.println("ahora ingrese su contraseña: ");
            String contra = sc.next();
            if (usuarioRfc.equals(user)) {
                if (contrar.equals(contra)) {
                    menu();
                    login = false;
                } else {
                    System.out.println("contraseña incorrecta");
                }
            } else {
                System.out.println("Usuario no encontrado");
            }
        }while (login);
    }

    public static void menu() {

        ArrayList<String> tareas = new ArrayList<>();
        int opc = 0;
        while (opc != 6) {
            System.out.println("""
                           lista de tareas: %s
                           ******************************** 
                           1 insertar tarea
                           2 consultar lista de tareas
                           3 modificar tarea especifica
                           4 finalizar tarea(eliminar)
                           5 vaciar la lista de tareas
                           6 salir
                           ********************************
                           """.formatted(tareas));
            opc = sc.nextInt();
            sc.nextLine();
            switch (opc) {
                case 1:
                    System.out.println("Que actividad desea agregar a su lista de tareas?: ");
                    tareas.add(sc.nextLine());
                    break;
                case 2:
                    System.out.println("Lista de tareas: " + tareas);
                    
                    break;
                case 3:
                    System.out.println("Ingrese la tarea que desea modificar: ");
                    int index = tareas.indexOf(sc.nextLine());
                    if (index != -1) {
                        System.out.println("Ingrese la nueva tarea: ");
                        tareas.set(index, sc.nextLine());
                    }
                    break;
                case 4:
                    System.out.println("Ingrese la tarea finalizada: ");
                    String tarea = sc.nextLine();
                    if (tareas.contains(tarea)) {
                        tareas.remove(tarea);
                    } else {
                        System.out.println("Tarea no reconocida");
                    }
                    break;
                case 5:
                    System.out.println("Limpiando la lista...");
                    tareas.clear();
                    break;
                case 6:
                    System.out.println("Finalizando ejecucion...");
                    opc = 6;
                    break;
                default:
                    System.out.println("opción invalida, elija un numero del menú");
            }
        }
    }
}
