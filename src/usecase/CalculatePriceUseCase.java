package usecase;

import models.Drink;
import models.SugaryDrink;

public class CalculatePriceUseCase {

    public float apply(Drink drink){

        if (drink instanceof SugaryDrink) {
            if (((SugaryDrink) drink).isPromoted()){
                return (float) (drink.getPrice() * 0.9);
            }
        }

        return drink.getPrice();
    }

}
