package Ejerc6;

import java.util.ArrayList;

public class TIendaVirtual {
    private ArrayList<Libro> libros;
    private ArrayList<Pelicula> peliculas;
    ArrayList<Object> carrito;
    private float totalVentas;

    public TIendaVirtual() {
        libros = new ArrayList<>();
        peliculas = new ArrayList<>();
        carrito = new ArrayList<>();
        totalVentas = 0;
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void agregarPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
    }

    public void agregarAlCarrito(Object producto) {
        carrito.add(producto);
    }

    public void eliminarDelCarrito(Object producto) {
        carrito.remove(producto);
    }
    public void registrarVenta() {
        if (!carrito.isEmpty()) {
            Object producto = carrito.remove(carrito.size() - 1);
            if (producto instanceof Libro) {
                totalVentas += ((Libro) producto).getPrecio();
            } else if (producto instanceof Pelicula) {
                totalVentas += ((Pelicula) producto).getPrecio();
            }
        }
    }

    public void imprimirListadoLibros() {
        System.out.println("Listado de libros disponibles:");
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }

    public void imprimirListadoPeliculas() {
        System.out.println("Listado de películas disponibles:");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
    }

    public void imprimirCarrito() {
        System.out.println("Carrito de compras:");
        for (Object producto : carrito) {
            if (producto instanceof Libro) {
                System.out.println(((Libro) producto));
            } else if (producto instanceof Pelicula) {
                System.out.println(((Pelicula) producto));
            }
        }
    }

    public void imprimirTotalVentas() {
        System.out.println("Total de ventas realizadas: $" + totalVentas);
    }
}
