package Class;

import java.util.ArrayList;

public class Turma {

    private int vagas;
    public int aulas;
    public Professor professor;
    public ArrayList<Estudante> estudantes = new ArrayList<Estudante>();

    public Turma (int vagas, Professor professor, Disciplina disciplina){
        setVagas(vagas);
        setProfessor(professor);
        disciplina.setTurma(this);
    }

    public void setVagas(int vagas) {

        this.vagas = vagas;
    }

    public void setAulas(int aulas) {

        this.aulas = aulas;
    }

    public void setProfessor(Professor professor) {

        this.professor = professor;
    }

    public void setEstudantes(ArrayList<Estudante> estudantes) {

        this.estudantes = estudantes;
    }

    public void matricular (){

    }
}
