package Clases;

import java.util.Scanner;

public class Usuario {

   private String nombre, email, rol;

    static Empleado_Regular empleado1 = new Empleado_Regular("andrea", "andrea@hotmail.com", "vendedora");
    static Supervisor supervisor1 = new Supervisor("Miguel", "miguel", "Supervisor");
    static Administrador administrador1 = new Administrador("Lucia", "lucia@gmail.com", "Aministrador");


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese que tipo de empleado");
        System.out.println("1: Empleado regular \n2: Supervisor \n3: Aministrador");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Empleado regular");
                empleado1.mostrarDetalles();
                break;

            case 2:
                System.out.println("Supervisor\nQue fun2ciones va a realizar \n" +
                        "1: Asignar Funciones \n" +
                        "2: Ver informacion empleado  ");
                int eleccion =0;
                eleccion = sc.nextInt();
                if (eleccion == 1) {
                    supervisor1.asignarTareas();
                } else if (eleccion == 2) {
                    supervisor1.mostrarDetalles();
                }
                else {
                    System.out.println("Opcion incorrecta");
                }
                break;

            case 3:
                System.out.println("Administrador \nQue funciones va a realizar \n1: Mostrar datos \n2: Modificar rol o datos empleado \n3:Eliminar empleado  ");

                eleccion = sc.nextInt();
                if (eleccion == 1) {
                    administrador1.mostrarDetalles();
                } else if (eleccion == 2) {
                    administrador1.modificarEmpleado();
                } else if (eleccion==3){
                    administrador1.eliminarEmpleado();
            }
                else {
                    System.out.println("Opcion incorrecta");
                }
                break;




            default:
                System.out.println("Opcion no validad");

        }
    }
}
