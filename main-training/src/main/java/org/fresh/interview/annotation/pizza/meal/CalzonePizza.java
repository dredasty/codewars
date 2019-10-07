package org.fresh.interview.annotation.pizza.meal;

import org.fresh.annotation.Factory;

@Factory(id = "Calzone", type = Meal.class)
public class CalzonePizza implements Meal {
    @Override
    public float price() {
        return 8.5f;
    }
}
