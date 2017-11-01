package org.grow.accessmode;

/**
 * <p/>
 * Date: 9/24/2017.
 *
 * @author Andrei Astaschenko
 */
public class AccessModifierTester {
    void printDefaultMethod() {
        System.out.println("print method access: Default");
    }

    public void printPublicMethod() {
        System.out.println("print method access: Public");
    }

    protected void printProtectedMethod() {
        System.out.println("print method access: Protected");
    }

    private void printPrivateMethod() {
        System.out.println("print method access: Private");
    }
}
