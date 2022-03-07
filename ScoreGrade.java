
public class ScoreGrade {

    private double testScore1;
    private double testScore2;
    private double testScore3;

    ScoreGrade() // Empty Const
    {

    }

    ScoreGrade(double testScore1, double testScore2, double testScore3)
    {
        this.testScore1 = testScore1;
        this.testScore2 = testScore2;
        this.testScore3 = testScore3;

    }

    //Methods
    public double calculateAverage(){
        double average = (testScore1 + testScore2 + testScore3) / 3;
        return average;
    }

    public void maxScore(){
        if (testScore1 > testScore2 && testScore1 > testScore3 )
        {
            System.out.println("Max is: " + testScore1);
        }
        else if (testScore2 > testScore1 && testScore2 > testScore3)
        {
            System.out.println("Max is: " + testScore2);
        }
        else
        {
            System.out.println("Max Score is: " + testScore3);
        }
        
    }

    
}


