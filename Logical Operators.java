import java.util.Scanner;

class Person {
    private String name;
    private int age;
    private boolean isCitizen;

    public Person(String name, int age, boolean isCitizen) {
        this.name = name;
        this.age = age;
        this.isCitizen = isCitizen;
    }

    public void checkEligibility() {
        if (age >= 18 && isCitizen) {
            System.out.println(name + " is eligible to vote.");
        } else {
            System.out.println(name + " is NOT eligible to vote.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Are you a citizen? (true/false): ");
        boolean isCitizen = scanner.nextBoolean();

        Person person1 = new Person(name, age, isCitizen);

        person1.checkEligibility();

        scanner.close();
    }

