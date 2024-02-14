import java.sql.SQLOutput;
import java.util.Scanner;
public class SchoolApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter school name:");
        String SchoolName = input.nextLine();

        System.out.println("Enter Schhol number:");
        int SchoolNumber = input.nextInt();

        System.out.println("Enter number of students");
        int NumberOfStud = input.nextInt();


        System.out.println("your school name is:" + SchoolName);
        System.out.println("your school number is:" + SchoolNumber);
        System.out.println("number of students are:" + NumberOfStud);
    }
}
