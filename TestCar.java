import javax.swing.JOptionPane;

public class TestCar {

    public static void main(String[] args){

        Car obj1 = new Car("Ford", "Explorer", 2009); //param
        Car obj2 = new Car(); //empty

        
        // Displays object Car using Parametized Constructor
        obj1.show();
        // Displays object Car using Empty Constructor
        obj2.show();

    }
    
}
