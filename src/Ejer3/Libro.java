package Ejer3;

public class Libro {
    private String titulo;
    private String autor;
    private String paginas;

    public Libro(String titulo, String autor, String paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
    public String Getinfo(){
        return "Titulo del libro:"+ this.titulo +"\n"+ "autor" + this.autor +"\n"+ "Paginas"+ this.paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getPaginas() {
        return paginas;
    }

    public void setPaginas(String paginas) {
        this.paginas = paginas;
    }
}
