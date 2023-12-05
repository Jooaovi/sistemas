
package com.mycompany.aluno;
public class AlunoGraduacao extends Aluno {
    private int semestre;
    public AlunoGraduacao(String nome,String curso, int semestre){
        super(nome,curso);
        this.semestre = semestre;
    }
    
}
