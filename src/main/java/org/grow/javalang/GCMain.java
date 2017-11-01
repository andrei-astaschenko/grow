package org.grow.javalang;

import java.util.Arrays;

import static java.lang.Class.forName;

/**
 * <p/>
 * Date: 10/3/2017.
 *
 * @author Andrei Astaschenko
 */
public class GCMain {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println(forName("grow.javalang.GCMain"));
        System.out.println(GCMain.class.getClass());

        System.out.println(Arrays.stream(GCMain.class.getClass().getMethods()));
        System.out.println(GCMain.class);

        System.out.println(new B());

        // System.out.println(forName("GCMain")); //throws exception
    }
}

class B {
    int b = 10;
}
