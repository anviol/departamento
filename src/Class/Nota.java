package Class;

public class Nota {

    private int valor;
    public Turma turma;

    public Nota (Turma turma, Estudante estudante){
        valor = 0;
        this.turma = turma;
        estudante.setNota(this);
    }

    public void setValor(int valor) {

        this.valor = valor;
    }

    public boolean aprovado(){

        return this.valor >= 60;
    }
}
