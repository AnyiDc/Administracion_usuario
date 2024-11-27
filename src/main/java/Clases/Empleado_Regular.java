package Clases;

public class Empleado_Regular {

    private String nombre, email,rol,tarea;

    public Empleado_Regular(String nombre, String email, String rol) {
        this.nombre = nombre;
        this.email = email;
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }
    public  String getRol(){
        return rol;
    }
    public String getTarea(){
        return tarea;
    }

    public void setNombre(){

    }
    public void setRol(){

    }
    public void setTarea(){

    }
    public void mostrarDetalles(){
        System.out.println("El empleado del nombre es "+ nombre+ " "+ email + " "+ rol);
    }

}
