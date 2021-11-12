package usecase;

import models.Drink;
import utils.Message;
import utils.ShowMenu;

import java.util.Scanner;

public class StoreUseCase {

    private static Drink[][] store = new Drink[5][5];
    private Scanner scanner = new Scanner(System.in);
    private Message message = new Message();
    private AddDrinkUseCase addDrinkUseCase = new AddDrinkUseCase();
    private PriceAllDrinksUseCase priceAllDrinksUseCase = new PriceAllDrinksUseCase();
    private PriceByMarkUseCase priceByMarkUseCase = new PriceByMarkUseCase();
    private PriceByShelvingUseCase priceByShelvingUseCase = new PriceByShelvingUseCase();
    private RemoveDrinkUseCase removeDrinkUseCase = new RemoveDrinkUseCase();

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
                    System.out.println(message.message(message.getPRICE() + priceAllDrinksUseCase.apply(store)));
                    break;

                case "2":

                    System.out.println(message.message(message.getPRICE() + priceByMarkUseCase.apply(store)));

                    break;

                case "3":

                    System.out.println(message.message(message.getPRICE() + priceByShelvingUseCase.apply(store)));
                    break;

                case "4":

                    System.out.println(addDrinkUseCase.apply(store));

                    break;

                case "5":

                    System.out.println(removeDrinkUseCase.apply(store));

                    break;

                case "6":

                    break;

                default:

                    System.out.println(message.getINCORRECT_OPTION());

            }

        } while (!option.equals("0"));

    }

}
