package org.fresh.interview.annotation.pizza.meal;

import org.fresh.annotation.Factory;

@Factory(id = "Tiramisu", type = Meal.class)
public class Tiramisu implements Meal {
    @Override
    public float price() {
        return 4.5f;
    }
}
