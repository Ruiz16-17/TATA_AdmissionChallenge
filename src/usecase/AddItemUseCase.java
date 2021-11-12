package usecase;

import models.Drink;
import models.MineralWater;
import models.SugaryDrink;
import utils.Message;

import java.util.Scanner;

public class AddItemUseCase {

    private Scanner scanner = new Scanner(System.in);
    private Message message = new Message();

    private Drink addItem(){
        String option = "";
        Drink drink = new Drink();

        do {

            System.out.println(
                    "1. Agua mineral.\n"+
                            "2. Bebida azucarada."
            );
            option = scanner.nextLine();

            switch (option){
                case "1":
                    return addMineralWater();

                case "2":
                    return addSugaryDrink();

                default:
                    System.out.println(message.getINCORRECT_OPTION());
            }

        }while (option!="1" && option!= "2");

        return drink;
    }

    private MineralWater addMineralWater() {

        System.out.println("Ingresar los litros");
        int liters = Integer.parseInt(scanner.nextLine());

        System.out.println("Ingresar el precio");
        float price = Float.parseFloat(scanner.nextLine());

        System.out.println("Ingresar la marca");
        String mark = scanner.nextLine();

        System.out.println("Ingresar el origen");
        String origin = assingOrigin();

        MineralWater mineralWater = new MineralWater(liters, price, mark, origin);

        return mineralWater;
    }

    private SugaryDrink addSugaryDrink() {

        System.out.println("Ingresar los litros");
        int liters = Integer.parseInt(scanner.nextLine());

        System.out.println("Ingresar el precio");
        float price = Float.parseFloat(scanner.nextLine());

        System.out.println("Ingresar la marca");
        String mark = scanner.nextLine();

        System.out.println("Ingresar el porcentaje de azucar");
        float suggarPercentage = Float.parseFloat(scanner.nextLine());

        System.out.println("Ingresar el porcentaje de azucar");
        boolean isPromoted = isPromoted();

        SugaryDrink sugaryDrink = new SugaryDrink(liters, price, mark, suggarPercentage,isPromoted);

        return sugaryDrink;
    }

    private String assingOrigin() {

        String option = "";

        do {

            System.out.println("" +
                    "¿Origen?\n"+
                    "1. Manantial.\n"+
                    "2. Oasis.\n"+
                    "3. Reserva."
            );
            option = scanner.nextLine();

            switch (option){
                case "1":
                    return "Manantial";

                case "2":
                    return "Oasis";

                case "3":
                    return "Reserva";

                default:
                    System.out.println(message.getINCORRECT_OPTION());
            }

        }while (!option.equals("1") && !option.equals("2") && !option.equals("3"));

        return "";

    }

    private boolean isPromoted() {

        String option = "";

        do {

            System.out.println("" +
                    "¿Está promocionado?\n"+
                    "1. Sí.\n"+
                    "2. No."
            );
            option = scanner.nextLine();

            switch (option){
                case "1":
                    return true;
                case "2":
                    return false;
                default:
                    System.out.println(message.getINCORRECT_OPTION());
            }

        }while (!option.equals("1") && !option.equals("2"));

        return false;

    }

    public String apply(Drink[][] store) {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (store[j][i] == null) {
                    store[j][i] = addItem();

                    return message.getADDED() + message.message(store[j][i].getId());
                }

            }
        }

        return "The store is full";
    }

}
