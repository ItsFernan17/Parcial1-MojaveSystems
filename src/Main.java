import Entities.EmpleadoEntity;
import Entities.ClienteEntity;
import Entities.ProveedorEntity;
import Repositories.EmpleadoRepository;
import Repositories.ClienteRepository;
import Repositories.ProveedorRepository;
import Services.EmpleadoService;
import Services.ClienteService;
import Services.ProveedorService;

public class Main {
    public static void main(String[] args) {
        EmpleadoRepository empleadoRepo = new EmpleadoRepository();
        ClienteRepository clienteRepo   = new ClienteRepository();
        ProveedorRepository proveedorRepo = new ProveedorRepository();

        EmpleadoService empleadoService = new EmpleadoService(empleadoRepo);
        ClienteService  clienteService  = new ClienteService(clienteRepo);
        ProveedorService proveedorService = new ProveedorService(proveedorRepo);

        // Empleados
        empleadoService.registrarEmpleado(new EmpleadoEntity("E001", "Juan Pérez", "Contador", 1000));
        empleadoService.registrarEmpleado(new EmpleadoEntity("E002", "María López", "Gerente", 3500));
        empleadoService.registrarEmpleado(new EmpleadoEntity("E001", "Luis Torres", "Vendedor", 800)); // ID repetido

        System.out.println("\nLista de empleados:");
        empleadoService.buscarTodos().forEach(System.out::println);

        System.out.println("\nEmpleados con puesto 'Gerente':");
        empleadoService.buscarEmpleadosPorPuesto("Gerente").forEach(System.out::println);

        // Clientes
        clienteService.registrarCliente(new ClienteEntity("C001", "Carlos Gómez", "Zona 1","555-1234"));
        clienteService.registrarCliente(new ClienteEntity("C002", "Ana Martínez","Zona 2", "555-5678"));
        clienteService.registrarCliente(new ClienteEntity("C001", "Pedro López","Zona 3", "555-9999")); // ID repetido

        System.out.println("\nLista de clientes:");
        clienteService.listarTodosClientes().forEach(System.out::println);

        System.out.println("\nClientes con teléfono '555-5678':");
        clienteService.buscarClientesPorTelefono("555-5678").forEach(System.out::println);

        System.out.println("\nCantidad total de clientes: " + clienteService.contarClientes());

        // Proveedores
        proveedorService.registrarProveedor(new ProveedorEntity("P001", "Distribuidora El Sol", "El Sol S.A.", "555-1111"));
        proveedorService.registrarProveedor(new ProveedorEntity("P002", "Importadora Luna", "Luna Imports", "555-2222"));
        proveedorService.registrarProveedor(new ProveedorEntity("P001", "Suministros Estrella", "Estrella Ltda.", "555-3333")); // ID repetido

        System.out.println("\nLista de proveedores:");
        proveedorService.listarTodosProveedores().forEach(System.out::println);

        System.out.println("\nProveedores con empresa 'Luna Imports':");
        proveedorService.buscarProveedoresPorEmpresa("Luna Imports").forEach(System.out::println);

        System.out.println("\nCantidad total de proveedores: " + proveedorService.contarProveedores());
    }
}
