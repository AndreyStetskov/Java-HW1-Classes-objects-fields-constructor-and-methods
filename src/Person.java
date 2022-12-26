import java.util.Random;

public class Person {
    Random random = new Random();
    String name;
    int age;
    int height;
    int weight;
    int money;


    public Person(String name, int age, int height, int weight) {
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.name = name;
    }

    public Person() {

    }


    public void info() {
        System.out.println("Person: " + name + ", " + age + " years old, height: " + height + " cm");
    }

    public void work() {
        if (age == 0 && name == null) {
            System.out.println("There is no information about this person");
        } else if (age < 18 || age > 70) {
            System.out.println(name + " is resting at home");
        } else {
            System.out.println(name + " is working");
        }
    }

    private int getMoney () {
        money = random.nextInt(0, 7000);
        return money;
    }
    // Description: Class Main cannot run method getMoney Error: getMoney has private access in Person.
    // So getMoney can be used only in class Person
}
