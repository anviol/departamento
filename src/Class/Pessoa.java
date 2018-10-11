package Class;

public class Pessoa {

    public String nome;
    public boolean vinculado;

    public Pessoa (String nome){

        setNome(nome);
        setVinculado(true);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVinculado(boolean vinculado) {

        this.vinculado = vinculado;
    }

    public void desligar(){
        setVinculado(false);
    }
}
