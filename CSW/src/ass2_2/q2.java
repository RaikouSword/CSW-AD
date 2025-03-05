package ass2_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

class ArrayListUser {
    private ArrayList<User> users;

    public ArrayListUser() {
        users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void printUsers() {
        for (User user : users) {
            System.out.println(user);
        }
    }

    public void sortUsersByAge() {
        Collections.sort(users, new Comparator<User>() {
            @Override
            public int compare(User u1, User u2) {
                return Integer.compare(u1.getAge(), u2.getAge());
            }
        });
    }
}

public class q2 {
    public static void main(String[] args) {
        ArrayListUser arrayListUser = new ArrayListUser();

        arrayListUser.addUser(new User("Alice", 25));
        arrayListUser.addUser(new User("Bob", 22));
        arrayListUser.addUser(new User("Charlie", 28));
        arrayListUser.addUser(new User("David", 20));

        System.out.println("Users before sorting:");
        arrayListUser.printUsers();

        arrayListUser.sortUsersByAge();

        System.out.println("\nUsers after sorting by age:");
        arrayListUser.printUsers();
    }
}
