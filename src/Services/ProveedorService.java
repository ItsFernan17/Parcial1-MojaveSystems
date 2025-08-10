package Services;

import Entities.ProveedorEntity;
import Repositories.ProveedorRepository;

import java.util.List;
import java.util.Optional;

public class ProveedorService {

    private final ProveedorRepository proveedorRepository;

    public ProveedorService(ProveedorRepository proveedorRepo) {

        this.proveedorRepository = new ProveedorRepository();
    }

    public void registrarProveedor(ProveedorEntity proveedor) {
        if (proveedorRepository.existeId(proveedor.getId())) {
            System.out.println("Error: Ya existe un proveedor con ID " + proveedor.getId());
        } else {
            proveedorRepository.registrar(proveedor);
            System.out.println("Proveedor registrado correctamente.");
        }
    }

    public Optional<ProveedorEntity> buscarProveedorPorId(String id) {
        return proveedorRepository.buscarPorId(id);
    }

    public List<ProveedorEntity> buscarProveedoresPorEmpresa(String empresa) {
        return proveedorRepository.buscarPorEmpresa(empresa);
    }

    public List<ProveedorEntity> listarTodosProveedores() {
        return proveedorRepository.listarTodos();
    }

    public int contarProveedores() {
        return proveedorRepository.contar();
    }
}
