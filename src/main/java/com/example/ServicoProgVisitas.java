package com.example;

public class ServicoProgVisitas implements IServico {
    public String cancelar() {
        return "Visita cancelada";
    }

    public String executar() {
        return "Visita realizada";
    }
}
