package usecase;

import models.Drink;
import models.SugaryDrink;

public class PriceAllDrinksUseCase {

    public float apply(Drink[][] store) {

        CalculatePriceUseCase calculatePriceUseCase = new CalculatePriceUseCase();

        float totalprice = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(store[i][j] != null){

                    totalprice += calculatePriceUseCase.apply(store[i][j]);
                }
            }
        }

        return totalprice;
    }


}
