package Class;

public class Nota {

    private int valor;

    public void setValor(int valor) {
        this.valor = valor;
    }

    public boolean aprovado(){
        return this.valor >= 70;
    }
}
