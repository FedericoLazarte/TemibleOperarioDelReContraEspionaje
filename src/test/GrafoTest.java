package test;

import static org.junit.Assert.*;

import org.junit.Test;

import logica.Grafo;


import org.junit.Before;

class GrafoTest {

    private Grafo<String> grafo;

    @Before
    public void setUp() {
        grafo = new Grafo<>();
    }

    @Test
    public void agregarVerticeOk() {
        int cantVertices = grafo.tamanio();
        grafo.agregarVertice("A");
        assertEquals(cantVertices + 1, grafo.tamanio());
    }
}
