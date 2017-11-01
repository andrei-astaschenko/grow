package org.grow.inheritance.one;

/**
 * <p/>
 * Date: 10/8/2017.
 *
 * @author Andrei Astaschenko
 */
public class Child extends Parent {
    int fieldProtected = 2;
    int fieldPublic = 20;

    public Child() {
        System.out.println("child contructor");
    }

    @Override
    public String toString() {
        return "Child{" +
                "fieldProtected=" + fieldProtected +
                ", fieldPublic=" + fieldPublic +
                '}';
    }
}
