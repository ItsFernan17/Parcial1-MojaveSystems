package Repositories;

import Entities.ClienteEntity;
import Entities.Interfaces.RegistrarInterface;
import Entities.Interfaces.ConsultarInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ClienteRepository
        implements RegistrarInterface<ClienteEntity>, ConsultarInterface<ClienteEntity> {

    private final List<ClienteEntity> clientes = new ArrayList<>();

    @Override
    public void registrar(ClienteEntity data) {
        clientes.add(data);
    }

    @Override
    public boolean existeId(String id) {
        return clientes.stream().anyMatch(c -> c.getId().equals(id));
    }

    @Override
    public Optional<ClienteEntity> buscarPorId(String id) {
        return clientes.stream()
                .filter(c -> c.getId().equals(id))
                .findFirst();
    }

    @Override
    public int contar() {
        return clientes.size();
    }

    public List<ClienteEntity> buscarPorTelefono(String telefono) {
        return clientes.stream()
                .filter(c -> c.getTelefono().equalsIgnoreCase(telefono))
                .collect(Collectors.toList());
    }

    public List<ClienteEntity> listarTodos() {
        return new ArrayList<>(clientes);
    }
}
