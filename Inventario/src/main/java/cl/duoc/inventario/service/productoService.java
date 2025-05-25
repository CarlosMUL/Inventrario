package cl.duoc.inventario.service;

import cl.duoc.inventario.model.productos;
import cl.duoc.inventario.repository.productoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
@Transactional

public class productoService {

    @Autowired
    private productoRepository productoRepository;

    public List<productos> BuscarProductos(){
        return productoRepository.findAll();
    }
    public productos BuscarUnProducto(Long idProducto){
        return productoRepository.findById(idProducto).get();
    }

    public productos GuardarProducto(productos producto){
        return productoRepository.save(producto);
    }
    public void EliminarProducto(Long idProducto){
        productoRepository.deleteById(idProducto);
    }
}
