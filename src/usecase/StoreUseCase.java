package usecase;

import models.Drink;
import models.MineralWater;
import models.SugaryDrink;
import utils.Message;

import java.util.Scanner;

public class StoreUseCase {

    private static Drink[][] store = new Drink[5][5];
    private Scanner scanner = new Scanner(System.in);
    private Message message = new Message();
    private AddItemUseCase addItemUseCase = new AddItemUseCase();

    public void starts() {

        String option = "";

        do {

            showMenu();
            option = scanner.nextLine();

            switch (option) {

                case "0":
                    break;

                case "1":

                    break;

                case "2":
                    break;

                case "3":


                    break;

                case "4":

                    System.out.println(addItem());

                    break;

                case "5":

                    break;

                case "6":

                    break;

                default:

                    System.out.println(message.getINCORRECT_OPTION());

            }

        } while (!option.equals("0"));

    }

    private void showMenu() {

        System.out.println(
                "Reto de java, elija una opción: \n" +
                        "0. Para salir.\n" +
                        "1. Calcular precio de todas las bebidas.\n" +
                        "2. Calcular el precio total de una marca de bebida.\n" +
                        "3. Calcular el precio total de una estantería.\n" +
                        "4. Agregar producto.\n" +
                        "5. Eliminar un producto.\n" +
                        "6. Mostrar información.\n"
        );
    }

    private String addItem() {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (store[i][j] == null) {
                    store[i][j] = addItemUseCase.apply();
                    System.out.println(store[i][j].getMark());
                    return "Agregado";
                }

            }
        }

        return "The store is full";
    }
/*
    private String priceAllDrinks() {
        float totalprice = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (store[i][j] == null) {
                    store[i][j] = addMineralWater();
                    return "Agregado: \n" +
                            "id: " + store[i][j].getId();
                }

            }
        }

        return "The store is full";
    }*/


}
