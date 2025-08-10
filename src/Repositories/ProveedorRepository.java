package Repositories;

import Entities.ProveedorEntity;
import Entities.Interfaces.RegistrarInterface;
import Entities.Interfaces.ConsultarInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ProveedorRepository
        implements RegistrarInterface<ProveedorEntity>, ConsultarInterface<ProveedorEntity> {

    private final List<ProveedorEntity> proveedores = new ArrayList<>();

    @Override
    public void registrar(ProveedorEntity data) {
        proveedores.add(data);
    }

    @Override
    public boolean existeId(String id) {
        return proveedores.stream().anyMatch(p -> p.getId().equals(id));
    }

    @Override
    public Optional<ProveedorEntity> buscarPorId(String id) {
        return proveedores.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();
    }

    @Override
    public int contar() {
        return proveedores.size();
    }

    public List<ProveedorEntity> buscarPorEmpresa(String empresa) {
        return proveedores.stream()
                .filter(p -> p.getEmpresa().equalsIgnoreCase(empresa))
                .collect(Collectors.toList());
    }

    public List<ProveedorEntity> listarTodos() {
        return new ArrayList<>(proveedores);
    }
}
