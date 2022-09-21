package ifpr.pgua.eic.leitura.models;

import java.time.LocalDate;

public class Leitura {
    
    private String titulo;
    private String autor;
    private LocalDate dataLeitura;
    private String opiniao;
    private double nota;
    
    public Leitura(String titulo, String autor, LocalDate dataLeitura, String opiniao, double nota) {
        this.titulo = titulo;
        this.autor = autor;
        this.dataLeitura = dataLeitura;
        this.opiniao = opiniao;
        this.nota = nota;
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

    public LocalDate getDataLeitura() {
        return dataLeitura;
    }

    public void setDataLeitura(LocalDate dataLeitura) {
        this.dataLeitura = dataLeitura;
    }

    public String getOpiniao() {
        return opiniao;
    }

    public void setOpiniao(String opiniao) {
        this.opiniao = opiniao;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String toString(){
        return titulo;
    }

    
}
