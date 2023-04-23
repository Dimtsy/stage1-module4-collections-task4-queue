package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        Queue<Integer> queue = new ArrayDeque<>();
        List<Integer> integerList = new ArrayList<>();
        for (int i = 1; i <= numberOfDishes; i++) {
            queue.add(i);
        }
        int i = 1;
        while (queue.peek() != null) {
            if (i % everyDishNumberToEat == 0) {
                integerList.add(queue.poll());
            } else {
                queue.add(queue.poll());
            }
            i++;
        }
        return integerList;
    }
}
