package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnalistaJuniorTest {
    @Test
    void deveRetonarPromovido() {
        AnalistaJunior analista = new AnalistaJunior();
        analista.setAnosExperiencia(2);
        assertEquals("Promovido para Pleno", analista.verificarPromocao());
    }

    @Test
    void deveRetonarPermaneceNoCargo() {
        AnalistaJunior analista = new AnalistaJunior();
        analista.setAnosExperiencia(1);
        assertEquals("Permanece como Junior", analista.verificarPromocao());
    }

    @Test
    void deveRetornarInformacoes() {
        AnalistaJunior analista = new AnalistaJunior();
        analista.setNome("Luana");
        analista.setCodigo(2);
        analista.setAnosExperiencia(4);
        assertEquals("Analista Junior{codigo=2, nome='Luana', resultado=Promovido para Pleno}", analista.getInfo());
    }

}