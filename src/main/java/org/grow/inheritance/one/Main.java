package org.grow.inheritance.one;

/**
 * <p/>
 * Date: 10/8/2017.
 *
 * @author Andrei Astaschenko
 */
public class Main {
    public static void main(String[] args) {
        Parent one = new Child();
        System.out.println("Test Child field: " + one);
        System.out.println(one.fieldProtected);
        System.out.println(one.fieldPublic);

        Child two = new Child();
        System.out.println("Test Child field:" + two);
        System.out.println(two.fieldProtected);
        System.out.println(two.fieldPublic);
    }
}
