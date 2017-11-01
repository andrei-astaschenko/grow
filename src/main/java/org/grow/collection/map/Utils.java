package org.grow.collection.map;

import java.util.Map;

/**
 * <p/>
 * Date: 10/31/2017.
 *
 * @author Andrei Astaschenko
 */
public class Utils {

    private static int ELEMENTS_COUNT = 5_000_000;

    public static void fillMap(Map map) {
        for (int i = 0; i < ELEMENTS_COUNT ; i++) {
            map.put(i, i);
        }
    }

    public static void getMapElements(Map map) {
        for (int i = 0; i < ELEMENTS_COUNT ; i++) {
            map.get(i);
        }
    }
}
