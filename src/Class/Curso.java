package Class;

import java.util.ArrayList;

public class Curso {

    protected String gradeCurricular;
    public ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();

    public Curso(String gradeCurricular, Departamento departamento){

        setGradeCurricular(gradeCurricular);
        departamento.setCurso(this);
    }

    public void setGradeCurricular(String gradeCurricular) {

        this.gradeCurricular = gradeCurricular;
    }

    public void setDisciplina(Disciplina disciplina) {

        this.disciplinas.add(disciplina);
    }

    public void notificarColegiado (){

    }
}
