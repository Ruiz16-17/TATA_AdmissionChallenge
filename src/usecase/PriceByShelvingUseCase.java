package usecase;

import models.Drink;

import java.util.Scanner;

public class PriceByShelvingUseCase {

    private Scanner scanner = new Scanner(System.in);

    public float apply(Drink[][] store) {

        int shelving = 0;
        float totalprice = 0;

        CalculatePriceUseCase calculatePriceUseCase = new CalculatePriceUseCase();

        System.out.println("Ingrese la estantería");
        shelving = Integer.parseInt(scanner.nextLine())-1;

        for (int i = 0; i < 5; i++) {

            if (store[i][shelving] != null) {

                totalprice += calculatePriceUseCase.apply(store[i][shelving]);
            }

        }

        return totalprice;
    }

}
