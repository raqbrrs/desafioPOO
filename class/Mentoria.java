/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafioPOO;

import java.time.LocalDate;

/**
 *
 * @author Raquel Barros
 */
public class Mentoria extends Conteudo{
    
     private String titulo;

    Mentoria() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "Mentoria{" + "titulo=" + titulo + ", descricao=" + descricao + ", date=" + date + '}';
    }
    
    private String descricao;

    public Mentoria(String titulo, String descricao, LocalDate date) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.date = date;
    }
    
   private  LocalDate date;

    /**
     * @return the date
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * @return the descricao
     */
  
    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public double calcularXp() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
