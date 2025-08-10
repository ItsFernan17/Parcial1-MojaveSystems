package Entities.Interfaces;

public interface RegistrarInterface<D>  {
    void registrar(D data);
    boolean existeId(String id);
}
