package com.epam.collections.queue;

import java.util.*;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        ArrayList<Integer> dishes = new ArrayList<>(numberOfDishes);
        List<Integer> eatenDishes = new ArrayList<>(numberOfDishes);
        for ( int i = 1 ; i <= numberOfDishes ; i++ ) {
            dishes.add(i);
        }

        int counter = 0;
        while (eatenDishes.size() != dishes.size()) {
            for (int i = 0; i < dishes.size(); i++) {
                int dish = dishes.get( i );
                if( dish == 0){
                    continue;
                }
                counter++;
                if ( counter == everyDishNumberToEat ) {
                    eatenDishes.add(dish);
                    dishes.set( i , 0);
                    counter = 0;
                }
            }
        }

        return eatenDishes;
    }
}
