package org.example;

public class AnalistaPleno extends Analista{
    @Override
    public String verificarPromocao() {
        if (this.getAnosExperiencia() >= 3) {
            return "Promovido para Sênior";
        }
        else {
            return "Permanece como Pleno";
        }
    }

    @Override
    public String getTipo() {
        return "Pleno";
    }
}
