package org.fresh.interview.annotation.pizza.meal;

import org.fresh.annotation.Factory;

@Factory(id = "Margherita", type = Meal.class)
public class MargheritaPizza implements Meal {
    @Override
    public float price() {
        return 6.0f;
    }
}
