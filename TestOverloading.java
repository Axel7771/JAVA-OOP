import java.util.Scanner;
//Driver
public class TestOverloading {

    public static void main(String args[])
    {
        Overloading obj = new Overloading();
        
        //Method Tests
        obj.max(50, 20, 5);
        obj.max("300", 400);
        obj.max('a', 50);
        obj.max("30", 10);
        obj.max('x', 90);
        obj.max(20, 40, 10);
        

    }
    
}
