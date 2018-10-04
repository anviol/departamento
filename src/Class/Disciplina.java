package Class;

public class Disciplina {

    public int cargaHoraria;
    public int prerequisito;
    public String ementa;
    public Turma turma = new Turma();

    public Disciplina (){

    }

    public Disciplina (int cargaHoraria, int prerequisito, String ementa){
        setCargaHoraria(cargaHoraria);
        setPrerequisito(prerequisito);
        setEmenta(ementa);
    }

    public Disciplina (int cargaHoraria, int prerequisito, String ementa, Turma turma){
        setCargaHoraria(cargaHoraria);
        setPrerequisito(prerequisito);
        setEmenta(ementa);
        setTurma(turma);
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void setPrerequisito(int prerequisito) {
        this.prerequisito = prerequisito;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public void adicionarTurma (){

    }
}
