package org.example;

public class AnalistaJunior extends Analista{
    public String verificarPromocao() {
        if (this.getAnosExperiencia() >= 2) {
            return "Promovido para Pleno";
        }
        else {
            return "Permanece como Junior";
        }
    }

    @Override
    public String getTipo() {
        return "Junior";
    }
}
