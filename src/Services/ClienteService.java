package Services;

import Entities.ClienteEntity;
import Repositories.ClienteRepository;

import java.util.List;
import java.util.Optional;

public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepo){
        this.clienteRepository = new ClienteRepository();
    }

    public void registrarCliente(ClienteEntity cliente){
        if(clienteRepository.existeId(cliente.getId())){
            System.out.println("Error: Ya existe un cliente con ID " + cliente.getId());
        } else {
            clienteRepository.registrar(cliente);
            System.out.println("Cliente registrado correctamente.");
        }
    }

    public Optional<ClienteEntity> buscarClientePorId(String id) {
        return clienteRepository.buscarPorId(id);
    }

    public List<ClienteEntity> buscarClientesPorTelefono(String telefono) {
        return clienteRepository.buscarPorTelefono(telefono);
    }

    public List<ClienteEntity> listarTodosClientes() {
        return clienteRepository.listarTodos();
    }

    public int contarClientes() {
        return clienteRepository.contar();
    }
}
