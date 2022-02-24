import javax.swing.JOptionPane;


public class TestCar {

    public static void main(String[] args){
        //User Car object input for parametized constructor
        String Make = JOptionPane.showInputDialog("Make:");
        String Model = JOptionPane.showInputDialog("Model: ");
        String strYear = JOptionPane.showInputDialog("Year: ");
        int year = Integer.parseInt(strYear);
        

        Car obj1 = new Car(Make,Model,year); //param
        Car obj2 = new Car(); //empty

        
        // Displays object Car using Parametized Constructor
        obj1.show();
        // Displays object Car using Empty Constructor
        obj2.show();

    }
    
}
