package Class;

public class Estudante extends Pessoa{

    protected int matricula;
    public Frequencia freguencia;
    public Nota nota;

    public Estudante(String nome) {
        super(nome);
    }


    public void setMatricula(int matricula) {

        this.matricula = matricula;
    }

    public void setFreguencia(Frequencia freguencia) {

        this.freguencia = freguencia;
    }

    public void setNota(Nota nota) {
        this.nota = nota;
    }

    public void desligar(){

    }
}
