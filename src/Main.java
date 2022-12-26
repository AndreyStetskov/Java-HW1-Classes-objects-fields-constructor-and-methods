public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Sam", 41, 168, 75);
        Person person3 = new Person("Bill", 11, 139, 31);
        Person person4 = new Person("Jessica", 25, 165, 52);
        Person person5 = new Person("Jenifer", 0, 49, 4);
        Person person6 = new Person();
        Person person7 = new Person("Bruce", 71, 187, 71);
        Person person8 = new Person("Sara", 19, 171, 61);
        Person person9 = new Person();
        Person person10 = new Person("Monica", 25, 175, 89);

        person1.info();
        person1.work();
        System.out.println();

        person2.info();
        person2.work();
        System.out.println();

        person3.info();
        person3.work();
        System.out.println();

        person4.info();
        person4.work();
        System.out.println();

        person5.info();
        person5.work();
        System.out.println();

        person6.info();
        person6.work();
        System.out.println();

        person7.info();
        person7.work();
        System.out.println();

        person8.info();
        person8.work();
        System.out.println();

        person9.info();
        person9.work();
        System.out.println();

        person10.info();
        person10.work();

    }
}