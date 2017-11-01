package org.grow.inheritance.one;

/**
 * <p/>
 * Date: 10/8/2017.
 *
 * @author Andrei Astaschenko
 */
public class Parent {
    protected int fieldProtected = 1;
    public int fieldPublic = 10;

    public Parent() {
        System.out.println("parent contructor");
    }

    @Override
    public String toString() {
        return "Parent{" +
                "fieldProtected=" + fieldProtected +
                ", fieldPublic=" + fieldPublic +
                '}';
    }
}
