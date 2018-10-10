package Tests;

import Class.Nota;
import static org.junit.Assert.*;

class NotaTest {

    @org.junit.jupiter.api.Test
    void aprovado() {
        Nota nota = new Nota();

        nota.setValor(30);

        assertFalse("Invalido para não reprovado igual a 30!", nota.aprovado());

        nota.setValor(70);

        assertTrue("Invalido para aprovado igual a 70!", nota.aprovado());

    }
}