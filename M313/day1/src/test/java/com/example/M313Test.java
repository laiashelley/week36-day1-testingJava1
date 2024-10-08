package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class M313Test {
    
    @Test
    public void testPuedeVotar() {
        boolean resultado = M313.puedeVotar(true, 20);
        assertTrue(resultado, "La persona puede votar.");
    }

    @Test
    public void testNoPuedeVotarEdad() {
        boolean resultado = M313.puedeVotar(true, 16);
        assertFalse(resultado, "La persona no puede votar.");
    }

    @Test
    public void testNoPuedeVotarNunca() {
        boolean resultado = M313.puedeVotar(false, 16);
        assertFalse(resultado, "No puede votar y punto.");
    }

}
