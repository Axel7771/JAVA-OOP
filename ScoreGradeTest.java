import java.util.Scanner;

public class ScoreGradeTest {

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter 3 Scores (Grades) ");
        double sc1 = keyboard.nextDouble();
        double sc2 = keyboard.nextDouble();
        double sc3 = keyboard.nextDouble();


        ScoreGrade ob = new ScoreGrade(sc1, sc2, sc3);

        System.out.println("Score average is: " + ob.calculateAverage());
        System.out.print("Max Score is: ");
        ob.maxScore();

        keyboard.close();

    }
}
