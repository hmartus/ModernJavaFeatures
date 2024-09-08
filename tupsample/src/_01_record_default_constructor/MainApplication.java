package _01_record_default_constructor;


public class MainApplication {

    public record Person(String name, int age){
        public Person(String name, int age){
            if(name != null && age > 0){
                this.name = name;
                this.age = age;
            } else {
                throw new IllegalArgumentException("Name and age are required");
            }
        }
    }

    public static void main(String[] args) {
        var person = new Person("TUP", 18);
        Person person2 = new Person("Juan Dela cruz", 11);

        System.out.println(person);
        System.out.println(person2);
    }
}
