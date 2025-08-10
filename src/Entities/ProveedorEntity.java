package Entities;

public class ProveedorEntity extends PersonaEntity {
    private String empresa;
    private String telefono;

    public ProveedorEntity(String id, String nombre, String empresa, String telefono) {
        super(id, nombre);
        this.empresa = empresa;
        this.telefono = telefono;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Proveedor {" +
                "ID='" + id + '\'' +
                ", Nombre='" + nombre + '\'' +
                ", Empresa='" + empresa + '\'' +
                ", Teléfono='" + telefono + '\'' +
                '}';
    }
}
