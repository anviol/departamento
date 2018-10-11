package Tests;

import Class.*;
import static org.junit.Assert.*;

import static org.junit.jupiter.api.Assertions.*;

class FrequenciaTest {

    Pessoa coodenador = new Pessoa("André");
    Pessoa subCoordenador = new Pessoa("Renata");

    Departamento departamento = new Departamento(coodenador, subCoordenador);

    Curso curso = new Curso("Grade Curricular", departamento);

    Disciplina disciplina = new Disciplina(curso);

    Professor professor = new Professor("Oliveira");

    Estudante estudante = new Estudante("Luiz");

    Turma turma = new Turma(25, professor, disciplina);

    Frequencia frequencia = new Frequencia(turma, estudante);

    @org.junit.jupiter.api.Test
    void suficiente() {

        this.turma.setAulas(50);

        this.frequencia.setAulas(50);
        assertTrue("Frenquecia valida de 100% não aprovada.", this.frequencia.suficiente());

        this.frequencia.setAulas(25);
        assertFalse("Frequencia de 50% aprovada.", this.frequencia.suficiente());
    }
}