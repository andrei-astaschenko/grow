package org.grow.collection.tasks.data;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class AppleData {
    public static List<Apple> getApples() {
        List<Apple> apples = new ArrayList();
        apples.add(new Apple(150, Color.GREEN));
        apples.add(new Apple(90, Color.GREEN));
        apples.add(new Apple(55, Color.RED));
        apples.add(new Apple(120, Color.RED));
        apples.add(new Apple(99, Color.YELLOW));
        return apples;
    }
}
