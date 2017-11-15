package org.grow.collection.tasks;

import org.grow.collection.tasks.data.Apple;
import org.grow.collection.tasks.data.AppleData;

import java.util.List;

public class Main4 {

    public static void main(String[] args) {
        List<Apple> apples = AppleData.getApples();

        // check for matching apples with red color
        boolean allMatch = apples.stream().allMatch(Apple::isRed);
        System.out.println("Are all apples red? :");
        System.out.println(allMatch);
    }
}

