import javax.swing.JOptionPane;

public class Car {

    public String make, model;
    public int year;
    
    //Constructors
    Car(){

        make = "Lexus";
        model = "NX 200C";
        year = 2015;

    }
    Car(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void show(){
        JOptionPane.showMessageDialog(null, "Make: " + make + "\nModel: " + model + "\nYear: " + year + "\n");
    }
}

