package com.andrepaulino;

import java.io.IOException;

import com.andrepaulino.client.ClientHttpConfiguration;
import com.andrepaulino.service.PetService;

public class ImportarPetsDoAbrigoCommand implements Command {

    @Override
    public void execute() {
        try {
            ClientHttpConfiguration client = new ClientHttpConfiguration();
            PetService petService = new PetService(client);

            petService.importarPetsDoAbrigo();
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

}
