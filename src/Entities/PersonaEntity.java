package Entities;

import Entities.Interfaces.PersonaInterface;

public abstract class PersonaEntity implements PersonaInterface {

    protected String id;
    protected String nombre;

    public PersonaEntity(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
