package Fut5App;

public class Entrenador {
    private String nombre;
    private String apellido;
    private  int edadEntrenador;
    private String nacionalidad;

    public Entrenador(String nombre, String apellido, int edad, String nacionalidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edadEntrenador = edadEntrenador;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edadEntrenador;
    }

    public void setEdad(int edad) {
        this.edadEntrenador = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Entrenador{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edadEntrenador +
                ", nacionalidad='" + nacionalidad + '\'' +
                '}';
    }
}
