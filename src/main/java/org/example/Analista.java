package org.example;

public abstract class Analista {
    private int codigo;
    protected String nome;
    private int anosExperiencia;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    public abstract String verificarPromocao();

    public abstract String getTipo();

    public String getInfo() {
        return "Analista " + getTipo() + "{" +
                "codigo=" + this.codigo +
                ", nome='" + this.nome + '\'' +
                ", resultado=" + this.verificarPromocao() +
                '}';
    }

}
