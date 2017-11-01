package org.grow.javalang;
import java.lang.*;


/**
 * <p/>
 * Date: 10/3/2017.
 *
 * @author Andrei Astaschenko
 */
public class Main {
    public static void main(String[] args) {
        HashCodeTester hashCodeTester1 = new HashCodeTester(1);
        HashCodeTester hashCodeTester2 = new HashCodeTester(1);
        System.out.println(hashCodeTester1.equals(hashCodeTester2));
        System.out.println(hashCodeTester1.hashCode());
        System.out.println(hashCodeTester2.hashCode());
    }
}
