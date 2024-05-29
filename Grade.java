import java.util.Scanner;
public class Grade{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = s.nextInt();
        double[] grades = new double[numStudents];
        for (int i = 0;i < numStudents;i++) {
            System.out.print("Enter the grade for student "+(i+1)+": ");
            grades[i] = s.nextDouble();
        }
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        double avg = sum / numStudents;
        double highest = Double.MIN_VALUE;
        double lowest = Double.MAX_VALUE;
        for (double grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
            if (grade < lowest) {
                lowest = grade;
            }
        }
        System.out.println("Average Grade: " + avg);
        System.out.println("Highest Grade: " + highest);
        System.out.println("Lowest Grade: " + lowest);
    }
}
