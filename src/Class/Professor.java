package Class;

public class Professor extends Pessoa {

    protected int registro;
    protected int gabinete;
    public Turma turma;

    public Professor(String nome) {
        super(nome);
    }

    public int getRegistro() {
        return registro;
    }

    public int getGabinete() {
        return gabinete;
    }

    public void desligar(){

    }
}
