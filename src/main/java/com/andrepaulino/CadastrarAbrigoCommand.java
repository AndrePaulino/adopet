package com.andrepaulino;

import java.io.IOException;

import com.andrepaulino.client.ClientHttpConfiguration;
import com.andrepaulino.service.AbrigoService;

public class CadastrarAbrigoCommand implements Command {
    @Override
    public void execute() {
        try {
            ClientHttpConfiguration client = new ClientHttpConfiguration();
            AbrigoService abrigoService = new AbrigoService(client);

            abrigoService.cadastrarAbrigo();
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
