package Tests;

import Class.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;


import static org.junit.jupiter.api.Assertions.*;

class DepartamentoTest {

    Pessoa coodenadorUm = new Pessoa("Andr�");
    Pessoa subCoordenadorUm = new Pessoa("Renata");
    Pessoa coordenadorDois = new Pessoa("Vin�cius");
    Pessoa subCoordenadorDois = new Pessoa("P�mela");

    Departamento departamento = new Departamento(coodenadorUm, subCoordenadorUm);

    @Test
    void setCoordenador() {
        this.departamento.setCoordenador(this.coordenadorDois);
        Assert.assertEquals("O coordenador n�o foi alterado", this.coordenadorDois, this.departamento.getCoordenador());
    }
}