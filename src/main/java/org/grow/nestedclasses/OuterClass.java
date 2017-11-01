package org.grow.nestedclasses;

/**
 * <p/>
 * Date: 10/8/2017.
 *
 * @author Andrei Astaschenko
 */
public class OuterClass {
    private static int fieldStatic = 1;
    private int fieldNonStatic = 10;

    private class InnerClass {
        private int field1 = fieldStatic;
        private int field2 = fieldNonStatic;
        //private static int field3;

        private void test() {
            OuterClass oc = new OuterClass();
            System.out.println(oc.fieldNonStatic);
            System.out.println(oc.fieldStatic);
        }

    }

    static class NestedClass {
        private static int field1;
        private int field2;

        private void test2() {
            System.out.println(fieldStatic);
            //System.out.println(fieldNonStatic);
        }

        private void test() {
            OuterClass oc = new OuterClass();
            System.out.println(oc.fieldNonStatic);
            System.out.println(oc.fieldStatic);
        }

    }

    void test() {
        OuterClass oc = new OuterClass();
        InnerClass ic = oc.new InnerClass();
        System.out.println(ic.field1);
        System.out.println(ic.field2);

        NestedClass nc = new NestedClass();
        System.out.println(nc.field1);
        System.out.println(nc.field2);
        nc.test();
    }
}
