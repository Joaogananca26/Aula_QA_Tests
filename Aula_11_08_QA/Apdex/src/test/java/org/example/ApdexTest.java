package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// João Henrique Murilla Ganança - 556405 - 2TDSPY

// Total de amostras deve ser o RM

public class ApdexTest {

    @Test
    public void apdexExcelente() {
        Apdex apdex = new Apdex();
        double resultado = apdex.apdex(556405, 0, 556405);
        assertEquals(1, resultado, 0.001);
    }

    @Test
    public void apdexBom() {
        Apdex apdex = new Apdex();
        double resultado = apdex.apdex(500765, 0, 556405);
        assertEquals(0.9, resultado, 0.001);
    }

    @Test
    public void apdexrazoavel() {
        Apdex apdex = new Apdex();
        double resultado = apdex.apdex(400611, 111281, 556405);
        assertEquals(0.82, resultado, 0.001);
    }

    @Test
    public void apdexRuim() {
        Apdex apdex = new Apdex();
        double resultado = apdex.apdex(294895, 111281, 556405);
        assertEquals(0.63, resultado, 0.001);
    }

    @Test
    public void apdexInaceitavel() {
        Apdex apdex = new Apdex();
        double resultado = apdex.apdex(0, 0, 556405);
        assertEquals(0, resultado, 0.001);
    }
}