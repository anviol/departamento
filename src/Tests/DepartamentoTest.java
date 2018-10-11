package Tests;

import Class.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;


import static org.junit.jupiter.api.Assertions.*;

class DepartamentoTest {

    Pessoa coodenadorUm = new Pessoa("André");
    Pessoa subCoordenadorUm = new Pessoa("Renata");
    Pessoa coordenadorDois = new Pessoa("Vinícius");
    Pessoa subCoordenadorDois = new Pessoa("Pâmela");

    Departamento departamento = new Departamento(coodenadorUm, subCoordenadorUm);

    @Test
    void setCoordenador() {
        this.departamento.setCoordenador(this.coordenadorDois);
        Assert.assertEquals("O coordenador não foi alterado", this.coordenadorDois, this.departamento.getCoordenador());
    }
}