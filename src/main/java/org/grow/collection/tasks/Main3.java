package org.grow.collection.tasks;

import org.grow.collection.tasks.data.Apple;
import org.grow.collection.tasks.data.AppleData;
import org.grow.collection.tasks.data.Color;

import java.util.List;
import java.util.stream.Collectors;

public class Main3 {

    public static void main(String[] args) {
        List<Apple> apples = AppleData.getApples();

        // get list of apple colors
        List<Color> appleColors = apples.stream().map(Apple::getColor).collect(Collectors.toList());
        System.out.println("Apple colors:");
        System.out.println(appleColors);
    }
}

