package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnalistaPlenoTest {
    @Test
    void deveRetonarPromovido() {
        AnalistaPleno analista = new AnalistaPleno();
        analista.setAnosExperiencia(3);
        assertEquals("Promovido para Sênior", analista.verificarPromocao());
    }

    @Test
    void deveRetonarPermaneceNoCargo() {
        AnalistaPleno analista = new AnalistaPleno();
        analista.setAnosExperiencia(2);
        assertEquals("Permanece como Pleno", analista.verificarPromocao());
    }

    @Test
    void deveRetornarInformacoes() {
        AnalistaPleno analista = new AnalistaPleno();
        analista.setNome("Luana");
        analista.setCodigo(2);
        analista.setAnosExperiencia(4);
        assertEquals("Analista Pleno{codigo=2, nome='Luana', resultado=Promovido para Sênior}", analista.getInfo());
    }

}