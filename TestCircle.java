
import java.util.Scanner;

//Driver

public class TestCircle
{
    //Main
    public static void main(String[] args)
    {
        
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter a radius: " );
      
        double Radius = keyboard.nextDouble();
        
        keyboard.close();
     
        Circle circle = new Circle(); //Create new obj Circle
        circle.setRadius(Radius); //verify user input is correct


        System.out.println("Given Radius is: " + circle.getRadius() + " ");
        System.out.println("Area is calculated to be: " + circle.getArea() + " ");
        System.out.println("Circumference is: " + circle.getCircumference() + " ");

    }
}
