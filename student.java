import java.util.Scanner;

public class Student
{
    public static void main(String[] args)
     {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        double[] marks = new double[numSubjects];

        for (int i = 0; i < numSubjects; i++) 
           {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextDouble();
           }
        double totalMarks = 0;
        for (double mark : marks)
          {
            totalMarks += mark;
          }

       
        double averagePercentage = totalMarks / numSubjects;
        String grade;
        if (averagePercentage >= 90)
        {
            grade = "A";
        } 
        else if (averagePercentage >= 80) 
        {
            grade = "B";
        }
        else if (averagePercentage >= 70) 
        {
            grade = "C";
        } 
        else if (averagePercentage >= 60)
        {
            grade = "D";
        } else 
        {
            grade = "F";
        }

     }
}