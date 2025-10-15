public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

        for(int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }
        Person person = new Person("Diego", 20);
        System.out.println("Person: " + person);
    }
}
