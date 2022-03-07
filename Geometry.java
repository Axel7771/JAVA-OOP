public class Geometry {

    //empty const
    public Geometry()
    {

    }
    //static methods
    public static void getArea(double Radius)
    {
        Radius = Math.PI * (Radius * Radius);
        System.out.println("Circle Area is: " + Radius);
     
    }

    public static void getArea(double length, double width)
    {
        double Area = length * width;
        System.out.println("Rectangle Area is: " + Area);
        
    }

    public static void gettriArea(double Base, double height)
    {
        double Area = (Base * height) * 0.5;
        System.out.println("Triangle Area is: " + Area);
    }

    
}
