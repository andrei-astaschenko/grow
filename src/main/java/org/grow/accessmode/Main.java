package org.grow.accessmode;

import org.grow.accessmode.inner.OutAccessModifierTester;

/**
 * <p/>
 * Date: 9/24/2017.
 *
 * @author Andrei Astaschenko
 */
public class Main {


    volatile String var = "1";

    public static void main(String[] args) {
        AccessModifierTester tester = new AccessModifierTester();
        tester.printDefaultMethod();
        tester.printPublicMethod();
        tester.printProtectedMethod();
        //tester.printPrivateMethod();

        OutAccessModifierTester tester2 = new OutAccessModifierTester();
        //tester2.printDefaultMethod();
    }
}
