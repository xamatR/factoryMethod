package com.example;

public class ServicoOrcamento implements IServico {
    public String cancelar() {
        return "Orçamento cancelado";
    }

    public String executar() {
        return "Orçamento liberado";
    }
    
}
