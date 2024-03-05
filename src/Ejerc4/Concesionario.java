package Ejerc4;

public class Concesionario {
    private String nombre;
    private String direccion;
    private int cantidadCarros;

    public Concesionario(String nombre, String direccion, int cantidadCarros) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cantidadCarros = cantidadCarros;
    }

public void agregarCarro(Carro carro) {
    Carro.add(carro);
}
    public String getNombre() {
        return nombre;
    }
    public boolean borrarCarro(Carro carro){
        return carro.remove(carro);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCantidadCarros() {
        return cantidadCarros;
    }

    public void setCantidadCarros(int cantidadCarros) {
        this.cantidadCarros = cantidadCarros;
    }
}
