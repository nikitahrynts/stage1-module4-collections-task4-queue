package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> result = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 1; i <= numberOfDishes; i++) {
            linkedList.add(i);
        }

        while (!linkedList.isEmpty()) {
            for (int i = 0; i < everyDishNumberToEat - 1; i++) {
                linkedList.add(linkedList.poll());
            }
            result.add(linkedList.poll());
        }
        return result;
    }
}
