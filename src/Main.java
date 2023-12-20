class Person {
    public String name;
    public int age;
    public Person() {

    }
    public Person(String name, int age) {
        this();
        setName(name);
        setAge(age);
    }
    public Person(String name) {
        this();
        setName(name);
    }
    public Person(int age) {
        this();
        setAge(age);
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void printDetails() {
        System.out.println(getName() + " " + getAge());
    }
}
public class Main {
    public static void main(String[] args) {
        Person i = new Person();
        Person he = new Person("Arsen", 18);
        i.setName("Rakhimbekov Rakhat");
        i.setAge(18);
        i.printDetails();
    }
}
