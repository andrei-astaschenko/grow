package org.grow.accessmode.orderaccessing.innerpack;

import org.grow.accessmode.orderaccessing.OutClass;

/**
 * <p/>
 * Date: 10/8/2017.
 *
 * @author Andrei Astaschenko
 */
public class ChildOutClass extends OutClass {
    public void test() {
        OutClass oc = new OutClass();
        // oc.testProtected();
        // oc.testDefault();
    }

    @Override
    protected void testProtected() {
        // has acces to protected
    }
}
