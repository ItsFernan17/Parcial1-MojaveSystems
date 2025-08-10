package Repositories;

import Entities.EmpleadoEntity;
import Entities.Interfaces.RegistrarInterface;
import Entities.Interfaces.ConsultarInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmpleadoRepository
        implements RegistrarInterface<EmpleadoEntity>, ConsultarInterface<EmpleadoEntity> {

    private final List<EmpleadoEntity> empleados = new ArrayList<>();

    @Override
    public void registrar(EmpleadoEntity data) {
        empleados.add(data);
    }

    @Override
    public boolean existeId(String id) {
        return empleados.stream().anyMatch(e -> e.getId().equals(id));
    }

    @Override
    public Optional<EmpleadoEntity> buscarPorId(String id) {
        return empleados.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst();
    }

    @Override
    public int contar() {
        return empleados.size();
    }

    public List<EmpleadoEntity> buscarPorPuesto(String puesto) {
        return empleados.stream()
                .filter(e -> e.getPuesto().equalsIgnoreCase(puesto))
                .collect(Collectors.toList());
    }

    public List<EmpleadoEntity> listarTodos() {
        return new ArrayList<>(empleados);
    }
}