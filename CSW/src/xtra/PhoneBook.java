package xtra;

import java.util.*;

class Details<T1, T2> {
    private T1 phoneNumber;
    private T2 name;

    public Details(T1 phoneNumber, T2 name) {
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

    public T1 getPhoneNumber() {
        return phoneNumber;
    }

    public T2 getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Phone Number: " + phoneNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Details<?, ?> details = (Details<?, ?>) obj;
        return Objects.equals(name, details.name) && Objects.equals(phoneNumber, details.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phoneNumber);
    }
}
public class PhoneBook {
    private TreeMap<String, Details<String, String>> phoneBook;

    public PhoneBook() {
        phoneBook = new TreeMap<>();
    }

    public void addContact(Details<String, String> contact) {
        phoneBook.put(contact.getName(), contact);
    }
    public void searchContact(String name) {
        if (phoneBook.containsKey(name)) {
            System.out.println("Contact Found: " + phoneBook.get(name));
        } else {
            System.out.println("Contact Not Found");
        }
    }

    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook();

        pb.addContact(new Details<>("1234567890", "Alice"));
        pb.addContact(new Details<>("2345678901", "Bob"));
        pb.addContact(new Details<>("3456789012", "Charlie"));
        pb.addContact(new Details<>("4567890123", "Daisy"));
        pb.addContact(new Details<>("5678901234", "Ethan"));

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name to search: ");
        String name = sc.nextLine();

        pb.searchContact(name);
        sc.close();
    }
}

