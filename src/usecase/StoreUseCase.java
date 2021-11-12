package usecase;

import models.Drink;
import models.MineralWater;
import models.SugaryDrink;
import utils.Message;
import utils.ShowMenu;

import java.util.Scanner;

public class StoreUseCase {

    private static Drink[][] store = new Drink[5][5];
    private Scanner scanner = new Scanner(System.in);
    private Message message = new Message();
    private AddItemUseCase addItemUseCase = new AddItemUseCase();
    private PriceAllDrinksUseCase priceAllDrinksUseCase = new PriceAllDrinksUseCase();
    private PriceByMarkUseCase priceByMarkUseCase = new PriceByMarkUseCase();

    public void starts() {

        ShowMenu showMenu = new ShowMenu();
        String option = "";

        do {

            showMenu.showMenu();
            option = scanner.nextLine();

            switch (option) {

                case "0":
                    break;

                case "1":
                    System.out.println(message.message("El precio de todas las bebidas es de: " + priceAllDrinksUseCase.apply(store)));
                    break;

                case "2":

                    System.out.println(message.message("El precio las bebidas es de: " + priceByMarkUseCase.apply(store)));

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

    private String addItem() {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (store[i][j] == null) {
                    store[i][j] = addItemUseCase.apply();

                    return message.getADDED() + message.message(store[i][j].getId());
                }

            }
        }

        return "The store is full";
    }


}
