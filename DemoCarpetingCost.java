import java.util.Scanner;



public class DemoCarpetingCost {


    public static void main(String[] args)
    {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("----====Rectangle Room Carpeting====----");

        System.out.println("Enter Room Dimensions (width x length) ");
        double width = keyboard.nextDouble();
        double length = keyboard.nextDouble();
        System.out.print("Enter Carpet Cost per Square ft: ");
        double cost = keyboard.nextDouble();

        
        RoomDimension room = new RoomDimension(width,length);
        RoomCarpet carpet = new RoomCarpet(room, cost);

        System.out.println("---====++++++++++++++++++++++++++====---\n");
        
        System.out.println("Room Dimension is: " + room.getString());
        System.out.println("Room Area is: " + room.getArea() + " ft");
        System.out.println("Calculating Cost: " + carpet.getString());
        System.out.println("Total Carpeting Cost: $" + carpet.getTotalCost());
        

    }
    
}
