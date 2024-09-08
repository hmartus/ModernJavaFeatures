package _03_record_serializable;

import java.io.*;

record Person(String name, int age) implements Serializable {
    public Person {
        System.out.println("record Person");
    }
}

// record -> file.txt

public class MainApplication {
    public static void main(String[] args) {
        var person = new Person("Juan", 30);
        writeToFile(person, "myPersonFile.txt");
        System.out.println(readFromFile("d:\\myPersonFile.txt"));
    }

    static void writeToFile(Person person, String fileName) {
        var path = "d:\\";
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path+fileName))) {
            oos.writeObject(person);
            System.out.println("writeToFile\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static Person readFromFile(String path) {
        Person result = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {
            result = (Person) ois.readObject();
            System.out.println("readFromFile\n");
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
