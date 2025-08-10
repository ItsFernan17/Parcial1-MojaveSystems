package Services;

import Entities.EmpleadoEntity;
import Repositories.EmpleadoRepository;
import java.util.List;
import java.util.Optional;

public class EmpleadoService {

    private final EmpleadoRepository empleadoRepository;


    public EmpleadoService(EmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }

    public void registrarEmpleado(EmpleadoEntity empleado) {
        if(empleadoRepository.existeId(empleado.getId())) {
            System.out.println("El empleado ya existe" +  empleado.getId());
        }  else {
            empleadoRepository.registrar(empleado);
            System.out.println("Empleado registrado");
        }
    }

    public Optional<EmpleadoEntity> buscarPorId(String id) {
        return empleadoRepository.buscarPorId(id);
    }

    public List<EmpleadoEntity> buscarTodos() {
        return empleadoRepository.listarTodos();
    }

    public List<EmpleadoEntity> buscarEmpleadosPorPuesto(String puesto) {
        return empleadoRepository.buscarPorPuesto(puesto);
    }
}
