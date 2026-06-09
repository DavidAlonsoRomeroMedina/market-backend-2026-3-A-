package mx.edu.tecdesoftware.market_backend_2026_3_A_.persistence.crud;

import mx.edu.tecdesoftware.market_backend_2026_3_A_.domain.Product;
import mx.edu.tecdesoftware.market_backend_2026_3_A_.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

    // Obtener una lista de productos filtrados por id_categoria
    // y ordenados ascendentemente por nombre
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idcategoria);

    // Obtener los productos escasos
    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidad, boolean estado);

    List<Product> getAll();
    Optional<List<Product>> getByCategory(int categoryId);
    Optional<List<Product>> getScarceproducts (int quantity);
    Optional<List<Product>> getProduct(int productId);
    Product save(Product product);
    void delete(int productId);
}
