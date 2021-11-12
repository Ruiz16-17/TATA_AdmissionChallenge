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
    private PriceByShelvingUseCase priceByShelvingUseCase = new PriceByShelvingUseCase();

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

                    System.out.println(addItemUseCase.apply(store));

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

}
