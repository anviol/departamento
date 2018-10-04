package Class;

public class Departamento {

    public String telefone;
    public Pessoa coordenador;
    public Pessoa subCoordenador;
    public Pessoa funcionarios[];
    public Curso curso = new Curso();

    public Departamento (){

    }

    public Departamento(String telefone, Pessoa coordenador, Pessoa subCoordenador, Pessoa funcionarios[], Curso curso){
        setTelefone(telefone);
        setCoordenador(coordenador);
        setSubCoordenador(subCoordenador);
        setFuncionarios(funcionarios);
        setCurso(curso);
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

    public void setFuncionarios(Pessoa[] funcionarios) {
        this.funcionarios = funcionarios;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void criarCruso(){

    }
}
