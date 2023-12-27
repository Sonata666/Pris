import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the course: ");
        String courseName = scanner.nextLine();

        System.out.println("Enter the total number of hours for the semester: ");
        float totalHours = scanner.nextFloat();

        Course course = new Course();
        course.name = courseName;
        course.hours = totalHours;

        course.addmoodle();
    }
}