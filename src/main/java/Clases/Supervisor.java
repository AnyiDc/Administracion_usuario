package Clases;

public class Supervisor {
   private String nombre, email,rol;

    public Supervisor(String nombre, String email, String rol) {
        this.nombre = nombre;
        this.email = email;
        this.rol = rol;
    }


    public void mostrarDetalles(){

        System.out.println(Usuario.empleado1.getNombre());
    }

    public void asignarTareas(){
Usuario.empleado1.setNombre();
    }
}
