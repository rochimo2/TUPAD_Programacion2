
public class main {
    public static void main(String[] args) {
        Inventario inv = new Inventario("abc");
        Producto p1 = new Producto("p1", "Leche", 50.0, 10, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("p2", "Televisor", 20000.0, 2, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("p3", "Remera", 1500.5, 5, CategoriaProducto.ROPA);
        Producto p4 = new Producto("p4", "Fuente para asado", 15000, 1, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("p5", "Fideos", 1500, 3, CategoriaProducto.ALIMENTOS);

        inv.agregarProducto(p1);
        inv.agregarProducto(p2);
        inv.agregarProducto(p3);
        inv.agregarProducto(p4);
        inv.agregarProducto(p5);

        

        System.out.println("Lista: " + inv.listarProductos());
        System.out.println("Buscar p2: " + inv.buscarProductoPorId("p2"));

        inv.actualizarStock("p1", 20);
        System.out.println("Total stock: " + inv.obtenerTotalStock());
        System.out.println("Mayor stock: " + inv.obtenerProductoConMayorStock());

        System.out.println("Filtrar ELECTRONICA: " + inv.filtrarPorCategoria(CategoriaProducto.ELECTRONICA));
        System.out.println("Filtrar precio 100-2000: " + inv.filtrarProductosPorPrecio(1000, 3000));
        System.out.println("Categorias: " + inv.mostrarCategoriasDisponibles());

        inv.eliminarProducto("p2");
        System.out.println("Después eliminar p2, lista: " + inv.listarProductos());
    }
}