package Entities;

public class EmpleadoEntity extends PersonaEntity {
    private String puesto;
    private double sueldo;

    public EmpleadoEntity(String id, String nombre, String puesto, double sueldo) {
        super(id, nombre);
        this.puesto = puesto;
        this.sueldo = sueldo;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado {" +
                "ID='" + id + '\'' +
                ", Nombre='" + nombre + '\'' +
                ", Puesto='" + puesto + '\'' +
                ", Salario=" + sueldo +
                '}';
    }
}
