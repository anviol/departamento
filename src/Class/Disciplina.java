package Class;

import java.util.ArrayList;

public class Disciplina {

    public int cargaHoraria;
    public int prerequisito;
    public String ementa;
    public ArrayList<Turma> turmas = new ArrayList<Turma>();

    public Disciplina(Curso curso){
        setCargaHoraria(0);
        setPrerequisito(0);
        setEmenta("");
        curso.setDisciplina(this);
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

        this.turmas.add(turma);
    }

    public void adicionarTurma (Turma turma){

        this.turmas.add(turma);
    }
}
