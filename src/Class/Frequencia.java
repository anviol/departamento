package Class;

public class Frequencia {

    private int aulas;
    private Turma turma;

    public Frequencia (Turma turma, Estudante estudante){
        aulas = 0;
        this.turma = turma;
        estudante.setFreguencia(this);
    }

    public void setAulas(int aulas) {

        this.aulas = aulas;
    }

    public boolean suficiente(){

        return ( aulas / turma.aulas) > 0.75;
    }
}
