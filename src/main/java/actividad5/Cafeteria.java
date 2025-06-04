package actividad5;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Cafeteria {
    public static void main(String[] args) {
        Queue <Pedido> pedidos = new LinkedList<>();

        System.out.println("Bienvenido a la Cafetería");
        Scanner sc = new Scanner(System.in);
        boolean finalizar = false;
        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Realizar un pedido");
            System.out.println("2. Consultar pedidos");
            System.out.println("3. finalizar un pedido");
            System.out.println("4. Salir");

            int opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    Pedido pedido = new Pedido();
                    System.out.println("Realizando un pedido...");
                    try {
                        realizarPedido(pedido);
                        pedidos.add(pedido);
                    } catch (InputMismatchException e) {
                        System.out.println("Por favor no ingrese letras en preguntas que esperan un numero.");;
                    }

                    break;
                case 2:
                    // Aquí se llamaría a un método para consultar pedidos
                    System.out.println("Consultando pedidos...");
                    if (pedidos.isEmpty()) {
                        System.out.println("No hay pedidos en la cola.");
                    } else {
                        System.out.println("Pedidos en la cola:");
                        for (Pedido p : pedidos) {
                            System.out.println(p);
                        }
                    }
                    break;
                case 3:
                    System.out.println("que pedido desea finalizar? (ingrese el folio del pedido): ");
                    int folio = sc.nextInt();
                    sc.nextLine(); // Limpiar el buffer
                    for (Pedido p : pedidos) {
                        if (p.getFolio() == folio) {
                            p.setActivo(false);
                            System.out.println("Pedido con folio " + folio + " finalizado. Pase a cajas a pagar: " + p.getTotal());
                            pedidos.remove(p);
                            break;
                        }else {
                            System.out.println("No se encontró un pedido con el folio " + folio);
                        }
                    }
                    break;
                case 4:
                    finalizar = true;
                    System.out.println("Saliendo de la Cafetería. ¡Gracias por visitarnos!");
                    break;
                default:
                    System.out.println("Por favor ingrese una opcion válida (1-4).");
            }
        } while (!finalizar);
        sc.close();
    }

    private static void realizarPedido(Pedido pedido) throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        System.out.println("cuantos productos desea comprar?: ");
        int num = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer
        for (int i = 0; i < num; i++) {
            System.out.println("Ingrese el nombre del producto " + (i + 1) + ":");
            String nombre = sc.nextLine();
            System.out.println("Ingrese el precio del producto " + nombre + ":");
            double precio = sc.nextDouble();
            System.out.println("Ingrese la cantidad de " + nombre + " que desea comprar:");
            int cantidad = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer

            Producto producto = new Producto(nombre, precio, cantidad);
            pedido.agregarProducto(producto);
            System.out.println("Producto agregado: " + producto);
        }
        System.out.println("Pedido realizado con éxito, su folio es: " + pedido.getFolio()
                           + " y el total es: " + pedido.getTotal());
    }
}
