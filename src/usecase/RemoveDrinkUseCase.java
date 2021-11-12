package usecase;

import models.Drink;
import utils.Message;

import java.util.Scanner;

public class RemoveDrinkUseCase {

    private Scanner scanner = new Scanner(System.in);
    private Message message = new Message();

    public String apply(Drink[][] store) {

        String id = "";

        System.out.println("Ingrese el ID de la bebida");
        id = scanner.nextLine();

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {
                if(store[i][j] != null && store[i][j].getId().equalsIgnoreCase(id)){

                    store[i][j] = null;

                    return message.getREMOVED();
                }
            }

        }

        return message.getNOT_FOUND();
    }

}
