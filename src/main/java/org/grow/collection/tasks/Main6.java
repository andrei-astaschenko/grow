package org.grow.collection.tasks;

import org.grow.collection.tasks.data.Apple;
import org.grow.collection.tasks.data.AppleData;
import org.grow.collection.tasks.data.Color;

import java.util.List;

public class Main6 {

    public static void main(String[] args) {
        List<Apple> apples = AppleData.getApples();

        // get sum of apples weight
        /*Apple mixedApple = apples.stream().reduce((a1, a2) -> new Apple(a1.getWeight() + a2.getWeight(), Color.GREEN))
                .orElseThrow(() -> new RuntimeException());
        System.out.println("Sum of apples weight :");
        System.out.println(mixedApple);*/
        Integer sum = apples.stream().mapToInt(Apple::getWeight).sum();
        System.out.println("Sum of apples weight :");
        System.out.println(sum);
    }

}

