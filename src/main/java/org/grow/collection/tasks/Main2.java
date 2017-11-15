package org.grow.collection.tasks;

import org.grow.collection.tasks.data.Apple;
import org.grow.collection.tasks.data.AppleData;

import java.util.List;
import java.util.stream.Collectors;

public class Main2 {

    public static void main(String[] args) {
        List<Apple> apples = AppleData.getApples();

        // list of red apples
        List<Apple> redApples = apples.stream().filter(Apple::isRed).collect(Collectors.toList());
        System.out.println("Red apples:");
        System.out.println(redApples);
        System.out.println("1) just, skip first red apple: ");
        System.out.println(redApples.stream().skip(1).collect(Collectors.toList()));
        System.out.println("2) just, skip first red apple: ");
        System.out.println(apples.stream().filter(Apple::isRed).skip(1).collect(Collectors.toList()));
    }

}

