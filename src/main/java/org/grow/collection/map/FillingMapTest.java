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
public class FillingMapTest {
    public static void main(String[] args) {
        System.out.println("Filling map test....");
        Map concurrentMap = new ConcurrentHashMap();
        Map hashMap = new HashMap();

        long startTime = System.currentTimeMillis();
        Utils.fillMap(concurrentMap);
        long concurrentMapTime = System.currentTimeMillis() - startTime;
        System.out.println("ConcurrentHashMap time for filling = " + concurrentMapTime);

        startTime = System.currentTimeMillis();
        Utils.fillMap(hashMap);
        long hashMapTime = System.currentTimeMillis() - startTime;
        System.out.println("HashMap time for filling = " + hashMapTime);
    }
}
