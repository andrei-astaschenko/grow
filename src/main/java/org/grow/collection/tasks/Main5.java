package org.grow.collection.tasks;

import org.grow.collection.tasks.data.Apple;
import org.grow.collection.tasks.data.AppleData;

import java.util.List;

public class Main5 {

    public static void main(String[] args) {
        List<Apple> apples = AppleData.getApples();

        // get first red apple
        System.out.println("First red apple :");
        Apple firstRedApple = apples.stream().filter(Apple::isRed).findFirst()
                .orElseGet(() -> {
                    System.out.println("not found");
                    return null;
                }
        );
        System.out.println(firstRedApple);
    }

}

