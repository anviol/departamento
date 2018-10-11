package Class;

import java.util.ArrayList;

public class Departamento {

    public String telefone;
    public Pessoa coordenador;
    public Pessoa subCoordenador;
    public ArrayList<Pessoa> funcionarios = new ArrayList<Pessoa>();
    public ArrayList<Curso> cursos = new ArrayList<Curso>();

    public Departamento(Pessoa coordenador, Pessoa subCoordenador){

        setCoordenador(coordenador);
        setSubCoordenador(subCoordenador);
    }

    public void setTelefone(String telefone) {

        this.telefone = telefone;
    }

    public void setCoordenador(Pessoa coordenador) {

        this.coordenador = coordenador;
    }

    public void setSubCoordenador(Pessoa subCoordenador) {

        this.subCoordenador = subCoordenador;
    }

    public void setFuncionarios(Pessoa funcionario) {

        this.funcionarios.add(funcionario);
    }

    public void setCurso(Curso curso) {

        this.cursos.add(curso);
    }

    public Pessoa getCoordenador() {
        return coordenador;
    }

    public Pessoa getSubCoordenador() {
        return subCoordenador;
    }

    public Curso criarCruso(String gradeCurricular){

        Curso curso = new Curso(gradeCurricular, this);
        setCurso(curso);
        return curso;
    }
}
