package mx.edu.tecdesoftware.market_backend_2026_3_A_.persistence;

import mx.edu.tecdesoftware.market_backend_2026_3_A_.persistence.crud.ProductoCrudRepository;
import mx.edu.tecdesoftware.market_backend_2026_3_A_.persistence.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository // Le indica a Spring que esta clase interactúa con la base de datos
public class ProductoRepository {

    @Autowired // Inyecta la dependencia automáticamente
    private ProductoCrudRepository productoCrudRepository;

    // SELECT * productos
    public List<Producto> getAll() {
        return (List<Producto>) productoCrudRepository.findAll();
    }

    public Optional<List<Producto>> getByCategoria(int idCategoria) {
        // Tu interfaz devuelve un List, por lo que lo envolvemos en un Optional
        // para respetar el tipo de retorno de este método.
        return Optional.ofNullable(productoCrudRepository.findByIdCategoriaOrderByNombreAsc(idCategoria));
    }

    public Optional<List<Producto>> getEscasos(int cantidad) {
        return productoCrudRepository.findByCantidadStockLessThanAndEstado(cantidad, true);
    }

    // Obtener un producto dado un ID
    // Corregido: findById siempre devuelve un solo elemento (Optional<Producto>)
    public Optional<Producto> getProductoById(int idProducto) {
        return productoCrudRepository.findById(idProducto);
    }

    // Corregido: save devuelve la entidad guardada
    public Producto save(Producto producto){
        return productoCrudRepository.save(producto);
    }

    // Corregido: deleteById no retorna nada (void)
    public void delete(int idProducto){
        productoCrudRepository.deleteById(idProducto);
    }
}