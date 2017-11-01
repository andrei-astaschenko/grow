package org.grow.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * <p/>
 * Date: 10/31/2017.
 *
 * @author Andrei Astaschenko
 */
public class GettingMapTest {
    public static void main(String[] args) {
        System.out.println("Init test data....");

        Map concurrentMap = new ConcurrentHashMap();
        Map hashMap = new HashMap();
        Utils.fillMap(concurrentMap);
        Utils.fillMap(hashMap);

        System.out.println("Getting map element test....");

        long startTime = System.currentTimeMillis();
        Utils.getMapElements(concurrentMap);
        long concurrentMapTime = System.currentTimeMillis() - startTime;
        System.out.println("ConcurrentHashMap time for filling = " + concurrentMapTime);

        startTime = System.currentTimeMillis();
        Utils.getMapElements(hashMap);
        long hashMapTime = System.currentTimeMillis() - startTime;
        System.out.println("HashMap time for filling = " + hashMapTime);
    }
}
