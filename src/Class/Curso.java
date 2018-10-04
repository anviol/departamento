package Class;

public class Curso {

    protected String gradeCurricular;
    public Disciplina disciplina = new Disciplina();

    public Curso(){

    }

    public Curso(String gradeCurricular){
        setGradeCurricular(gradeCurricular);
    }

    public Curso(String gradeCurricular, Disciplina disciplina){
        setGradeCurricular(gradeCurricular);
        setDisciplina(disciplina);
    }

    public void setGradeCurricular(String gradeCurricular) {
        this.gradeCurricular = gradeCurricular;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public void notificarColegiado (){

    }
}
