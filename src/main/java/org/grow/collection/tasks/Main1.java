package org.grow.collection.tasks;

import org.grow.collection.tasks.data.Apple;
import org.grow.collection.tasks.data.AppleData;

import java.util.List;
import java.util.stream.Collectors;

public class Main1 {

    public static void main(String[] args) {
        List<Apple> apples = AppleData.getApples();

        // find light weight apples
        List<Apple> lightweightApples = apples.stream().filter(Apple::isLightWeight).collect(Collectors.toList());
        System.out.println("Lightweight apples:");
        System.out.println(lightweightApples);
        System.out.println();
    }

}

