package Tests;

import static org.junit.Assert.*;
import Class.*;

class NotaTest {

    @org.junit.jupiter.api.Test
    void aprovado() {

        Pessoa coodenador = new Pessoa("André");
        Pessoa subCoordenador = new Pessoa("Renata");

        Departamento departamento = new Departamento(coodenador, subCoordenador);

        Curso curso = new Curso("Grade Curricular", departamento);

        Disciplina disciplina = new Disciplina(curso);

        Professor professor = new Professor("Oliveira");

        Estudante estudante = new Estudante("Luiz");

        Turma turma = new Turma(25, professor, disciplina);

        Nota nota = new Nota(turma, estudante);

        nota.setValor(30);

        assertFalse("Invalido para não reprovado igual a 30!", nota.aprovado());

        nota.setValor(70);

        assertTrue("Invalido para aprovado igual a 70!", nota.aprovado());

    }
}