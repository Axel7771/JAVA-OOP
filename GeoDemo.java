import java.util.Scanner;

public class GeoDemo {

    private int choice;

    public GeoDemo()
    {
        

    }

    public void setChoice(int choice)
    {
        if (choice <= 4 && choice != 0)
        {
            this.choice = choice;
        }
        else{
            System.out.print("Error: Choice input out of Range");
            System.exit(1);
        }
    }



    public static void main(String[] args)
    {
        
        
        Scanner keyboard = new Scanner(System.in);

        //Objects
        GeoDemo demo = new GeoDemo();
        Geometry geo = new Geometry();


        System.out.println("Enter your choice ");

        int choice = 0;

        while(choice <= 4)
        {
            System.out.println("------=====MENU=====------\nGeometry Calculator");
            System.out.println("1. Calculate Area of Circle\n2. Calculate Area of a Rectangle\n" + 
             "3. Calculate Radius of a Triangle\n4. Exit(4)");
            choice = keyboard.nextInt();
            demo.setChoice(choice);

     
        
            switch(choice)
            {
            case 1:
                System.out.print("Please Enter a Radius: ");
                double Radius = keyboard.nextInt();
                geo.getArea(Radius);
                
                break;
            case 2:
                System.out.println("Enter Width x Length: ");
                double length = keyboard.nextInt();
                double width = keyboard.nextInt();
                geo.getArea(length, width);

                break;
            case 3:
                System.out.println("Enter Base and Height: ");
                double base = keyboard.nextInt();
                double height = keyboard.nextInt();
                geo.gettriArea(base, height);
                break;
            case 4:
                System.out.println("\n>>>> Exiting ...");
                System.exit(1);
                break;
            }
        }
        

    }

    
}
    

