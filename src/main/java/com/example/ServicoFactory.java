package com.example;

public class ServicoFactory {

    public static IServico obterServico(String servico) {
        Class classe = null;
        Object objeto = null;
        try{
            classe = Class.forName("com.example.Servico" + servico);
            //I changed the line below to use the newInstance() method instead of getDeclaredConstructor().newInstance() because the former is deprecated
            objeto = classe.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Tipo de serviço inexistente");
        }

        if (!(objeto instanceof IServico)) {
            throw new RuntimeException("Tipo de serviço inválido");
        }

        return (IServico) objeto;
    }
    
}
