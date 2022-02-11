
/* 
Create A class Circle and TestCircle Circle. should have attributes Radius and PI
Class circle should have methods to return Radius, Area, and Circumference
class Circle should hold constructors and methods 
class TestCircle will act as driver program and act as user input
*/

public class Circle{
    
    final double PI = 3.141;
    double Radius;
    //Construct Object Circle with data type double 
    public Circle( ){
        
        this.Radius = 0.0;
    }

    public Circle(double Radius){
        this.Radius = Radius;
    }


    //Set methods
   
    public void setRadius(double Radius){
        if (Radius > 0.0 & Radius < 50.0) //Check User Input 
        {
            this.Radius = Radius;
        }
        else{
            System.out.println("Error Radius input (datatype Double)out of Range:\n >> System Exit ");
            System.exit(0);
        }
    }

    //Get Methods


    //Return Radius
    public double getRadius(){
        return Radius;
    }
    //Return Area
    public double getArea(){  
        return PI * (Radius * Radius);
    }

    //Return Circumference
    public double getCircumference(){
        return 2 * PI * Radius;
    }



}   


