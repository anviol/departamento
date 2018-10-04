package Class;

public class Turma {

    private int vagas;
    public String professor;
    public Estudante estudantes[];

    public Turma (){

    }

    public Turma (int vagas, String professor){
        setVagas(vagas);
        setProfessor(professor);
    }

    public Turma (int vagas, String professor, Estudante estudantes[]){
        setVagas(vagas);
        setProfessor(professor);
        setEstudantes(estudantes);
    }

    public void setVagas(int vagas) {
        this.vagas = vagas;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public void setEstudantes(Estudante[] estudantes) {
        this.estudantes = estudantes;
    }

    public void matricular (){

    }
}
