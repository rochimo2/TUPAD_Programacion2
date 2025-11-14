import java.util.ArrayList;
import java.util.List;


public class Inventario {
    private String codigo;
    private List<Producto> productos = new ArrayList<>();

    public Inventario(String codigo) {
        this.codigo = codigo;
    }

    public void agregarProducto(Producto p) {
        if (p == null) return;
        productos.add(p);
    }

    public List<Producto> listarProductos() {
        return new ArrayList<>(productos);
    }

    public Producto buscarProductoPorId(String id) {
        if (id == null) return null;
        for (Producto productoActual : productos) {
            if (id.equals(productoActual.getId())) {
                return productoActual;
            }
        }
        return null;
    }


    public void eliminarProducto(String id) {
        Producto p = buscarProductoPorId(id);
        if (p == null) return;
        productos.remove(p);
    }

    public void actualizarStock(String id, int nuevaCantidad) {
        Producto p = buscarProductoPorId(id);
        if (p == null) return;
        p.setCantidad(nuevaCantidad);
    }

    public List<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        if (categoria == null) return new ArrayList<>();
        List<Producto> listaFiltrada = new ArrayList<>();

        for (Producto productoActual : productos) {
            CategoriaProducto categoriaDelProducto = productoActual.getCategoria();

            if (categoria.equals(categoriaDelProducto)) {
                listaFiltrada.add(productoActual);
            }
        }

        return listaFiltrada;
    }

    public int obtenerTotalStock() {
        int total = 0;

        for (Producto p : productos) {
            total = total + p.getCantidad();
        }

        return total;
    }

    public Producto obtenerProductoConMayorStock() {
        Producto p_max_stock = null;
        int maximoStock = -1;

        for (Producto p : productos) {
            if (p.getCantidad() > maximoStock) {
                maximoStock = p.getCantidad();
                p_max_stock = p;
            }
        }

        return p_max_stock;
    }

    public List<Producto> filtrarProductosPorPrecio(double min, double max) {
        List<Producto> listaFiltrada = new ArrayList<>();

        for (Producto p : productos) {
            double precioActual = p.getPrecio();

            if (precioActual >= min && precioActual <= max) {
                listaFiltrada.add(p);
            }
        }

        return listaFiltrada;
    }

    public List<CategoriaProducto> mostrarCategoriasDisponibles() {
        List<CategoriaProducto> categoriasEncontradas = new ArrayList<>();

        for (Producto productoActual : productos) {
            CategoriaProducto categoriaDelProducto = productoActual.getCategoria();

            if (!categoriasEncontradas.contains(categoriaDelProducto)) {
                categoriasEncontradas.add(categoriaDelProducto);
            }
        }
        return categoriasEncontradas;
    }

}
