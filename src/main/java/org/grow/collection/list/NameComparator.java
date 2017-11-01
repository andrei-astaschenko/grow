package org.grow.collection.list;

import java.util.Comparator;

/**
 * <p/>
 * Date: 10/31/2017.
 *
 * @author Andrei Astaschenko
 */
public class NameComparator implements Comparator<User>{
    @Override
    public int compare(User o1, User o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
