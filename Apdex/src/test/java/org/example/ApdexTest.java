package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApdexTest {

    @Test
    public void apdexExcelente() {
        Apdex apdex = new Apdex();
        double resultado = apdex.apdex(1000, 0, 1000);
        assertEquals(1, resultado, 0.001);
    }

    @Test
    public void apdexBom() {
        Apdex apdex = new Apdex();
        double resultado = apdex.apdex(90, 0,  100);
        assertEquals(0.9, resultado);
    }


    @Test
    public void razoavel() {
        Apdex apdex = new Apdex();
        double resultado = apdex.apdex(72, 20, 100);
        assertEquals(0.82, resultado, 0.001);
    }

    @Test
    public void apdexRuim() {
        Apdex apdex = new Apdex();
        double resultado = apdex.apdex(53, 20,  100);
        assertEquals(0.63, resultado, 0.001);
    }

    @Test
    public void apdexInaceitavel() {
        Apdex apdex = new Apdex();
        double resultado = apdex.apdex(0, 0, 100);
        assertEquals(0, resultado, 0.001);
    }
}
