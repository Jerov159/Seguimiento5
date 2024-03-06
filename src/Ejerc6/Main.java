package Ejerc6;

public class Main {
    public static void main(String[] args) {
        TIendaVirtual tienda = new TIendaVirtual();

        tienda.agregarLibro(new Libro("J.K. Rowling", "Harry Potter y la piedra filosofal", 15.5f));
        tienda.agregarLibro(new Libro("George R.R. Martin", "Juego de tronos", 20.9f));

        // Agregar películas
        tienda.agregarPelicula(new Pelicula("El Padrino", "Marlon Brando", "Francis Ford Coppola", 12.5f));
        tienda.agregarPelicula(new Pelicula("El señor de los anillos: la comunidad del anillo", "Elijah Wood", "Peter Jackson", 14.99f));

        // Agregar al carrito
        tienda.carrito.agregarProducto(tienda.libros.get(0));
        tienda.carrito.agregarProducto(tienda.peliculas.get(1));

        // Registrar ventas
        tienda.registrarVenta();

        System.out.println("Listado de libros disponibles:");
        for (Libro libro : tienda.libros) {
            System.out.println(libro);
        }
        System.out.println("\nListado de películas disponibles:");
        for (Pelicula pelicula : tienda.peliculas) {
            System.out.println(pelicula);
        }
        System.out.println("\nCarrito de compras:");
        System.out.println(tienda.carrito);
        System.out.println("\nTotal de ventas realizadas: $" + tienda.totalVentas);
    }
}
