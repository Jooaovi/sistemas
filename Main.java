
package com.mycompany.aluno;


public class Main{

   
    public static void main(String args[])
    {
        Aluno alunoGraduacao = new AlunoGraduacao("joao","matematica", 3);
        alunoGraduacao.adicionarNota(8.0);
        alunoGraduacao.adicionarNota(7);
        
        
       AlunoPosGraduacao alunoPos = new AlunoPosGraduacao("maria","Fisica", "pesquisa quantica");
       alunoPos.adicionarNota(7.5);
       alunoPos.adicionarNota(8.5);
       
       System.out.println("media do aluno de posgraduacao: " + alunoPos.calcularMedia());
       System.out.println("media do aluno de graduacao" + alunoGraduacao.calcularMedia());
       
    }
    
}
