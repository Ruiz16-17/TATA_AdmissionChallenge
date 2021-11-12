package usecase;

import models.Drink;

import java.util.Scanner;

public class PriceByMarkUseCase {

    private Scanner scanner = new Scanner(System.in);

    public float apply(Drink[][] store) {

        String mark="";

        System.out.println("Ingrese la marca");
        mark = scanner.nextLine();

        CalculatePriceUseCase calculatePriceUseCase = new CalculatePriceUseCase();

        float totalprice = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(store[i][j] != null && store[i][j].getMark().equalsIgnoreCase(mark)){

                    totalprice += calculatePriceUseCase.apply(store[i][j]);
                }
            }
        }

        return totalprice;
    }

}
