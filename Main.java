/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafioPOO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Raquel Barros
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Curso curso1 = new Curso() {};
        curso1.setTitulo("curso java");
        curso1.setDescricao("descriçao curso java");
        curso1.setCargaHoraria(8);
        
        Curso curso2 = new Curso() {};
        curso2.setTitulo("curso python");
        curso2.setDescricao("descriçao curso python");
        curso2.setCargaHoraria(5);
        
         Curso curso3 = new Curso() {};
        curso3.setTitulo("curso fullstack");
        curso3.setDescricao("descriçao curso fullstack");
        curso3.setCargaHoraria(7);
        
        Conteudo conteudo = new Curso() {};
        Conteudo conteudo1 = new Mentoria();
        
        List<String> palavras = new ArrayList<>();
        
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao");
        mentoria.setDate(LocalDate.now());
        
        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(curso3);
        System.out.println(mentoria);*/
        
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java Dev");
        bootcamp.setDescricao("Descricao");
        bootcamp.getConteudos().add(curso1);
             bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso3);
        bootcamp.getConteudos().add(mentoria);

            Dev devRaquel = new Dev();
            devRaquel.setNome("Raquel");
            devRaquel.inscreverBootcamp(bootcamp);
            System.out.println("Conteudos Inscritos Raquel" + devRaquel.getConteudosInscritos());
        
    }
    
}
