package org.grow.collection.list;

/**
 * <p/>
 * Date: 10/31/2017.
 *
 * @author Andrei Astaschenko
 */
public class User implements Comparable<User>{
    private int age;
    private String name;

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(User user) {
        return this.getAge() - user.getAge();
    }
}
