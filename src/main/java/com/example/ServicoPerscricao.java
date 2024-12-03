package com.example;

public class ServicoPerscricao implements IServico {
    public String cancelar() {
        return "Prescrição estornada";
    }

    public String executar() {
        return "Prescrição liberada";
    }
    
}
