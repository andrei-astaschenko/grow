package org.grow.accessmode;

/**
 * <p/>
 * Date: 10/8/2017.
 *
 * @author Andrei Astaschenko
 */
public class AccessClassElement {
    private class PrivateClass{

    }
    protected class ProtectedClass{

    }
    class DefaultClass{

    }
    public class PublicClass{

    }

    private void test() {
        new PrivateClass();
        new ProtectedClass();
        new DefaultClass();
        new PublicClass();
    }

}

class AccessTester {
    private void test() {
        AccessClassElement ace = new AccessClassElement();
        //ace.new PrivateClass();
        ace.new ProtectedClass();
        ace.new DefaultClass();
        ace.new PublicClass();
    }
}
