package Entities.Interfaces;

import java.util.List;
import java.util.Optional;

public interface ConsultarInterface<T> {
    Optional<T> buscarPorId(String id);
    int contar();
}
