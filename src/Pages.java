import java.util.Scanner;

public class Pages {

    public static int getExpectantPages(int age) {
        return 100 - age;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        String ageString = scanner.nextLine(); // nextInt
        int age = Integer.parseInt(ageString);
        System.out.println("Your minimum date age IS: " + getExpectantPages(age));

    }
}
