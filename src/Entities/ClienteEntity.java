package Entities;

public class ClienteEntity extends PersonaEntity {

    private String direccion;
    private String telefono;

    public ClienteEntity(String id, String nombre, String direccion, String telefono) {
        super(id, nombre);
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente {" +
                "ID='" + id + '\'' +
                ", Nombre='" + nombre + '\'' +
                ", Dirección='" + direccion + '\'' +
                ", Teléfono='" + telefono + '\'' +
                '}';
    }
}
