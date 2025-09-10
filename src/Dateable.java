import java.util.Scanner;

public class Dateable {

    public static int minimumDateAge (int age) {
        return (int) ((int) (age / 2d) + 7d);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        String ageString = scanner.nextLine(); // nextInt
        int age = Integer.parseInt(ageString);
        System.out.println("Your minimum date age IS: " + minimumDateAge(age));

    }
}
