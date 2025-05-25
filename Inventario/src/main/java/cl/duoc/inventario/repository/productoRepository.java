package cl.duoc.inventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import cl.duoc.inventario.model.productos;

public interface productoRepository extends JpaRepository<productos,Long> {
}
