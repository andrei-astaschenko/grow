package org.grow.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

/**
 * <p/>
 * Date: 10/31/2017.
 *
 * @author Andrei Astaschenko
 */
public class SortTestMain {
    public static void main(String[] args) {
        System.out.println("Init data...");
        List users = new ArrayList<>();
        users.add(new User(16, "John"));
        users.add(new User(49, "Cris"));
        users.add(new User(27, "Antony"));

        System.out.println("Sort list by age...");
        users.sort(new AgeComparator());
        System.out.println("Result age sorting...");
        users.stream().forEach(new PrintConsumer());

        System.out.println("Sort list by name...");
        users.sort(new NameComparator());
        System.out.println("Result age sorting...");
        users.stream().forEach(new PrintConsumer());

        System.out.println("Sort using Collections...");
        Collections.sort(users);
        System.out.println("Result Collections sorting...");
        users.stream().forEach(new PrintConsumer());
    }

    private static class PrintConsumer implements Consumer<User>{
        @Override
        public void accept(User user) {
            System.out.println(user);
        }
    }

}


