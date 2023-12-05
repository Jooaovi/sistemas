



package com.mycompany.aluno;
import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private String curso;
    private List<Double> notas = new ArrayList<>();
    
    public Aluno(String nome,String curso){
        this.nome = nome;
        this.curso = curso;
    }
    public String getNome(){
        return nome;
    }
    public String getCurso(){
        return curso;
    }
    public List<Double> getNotas(){
        return notas;
    }
    public void adicionarNota(double nota){
        notas.add(nota);
    }
    public double calcularMedia(){
        double soma = 0;
        for(double nota: notas){
            soma += nota;
        }
        return soma/ notas.size();
        }
    }



    
     
    

