public class RoomDimension {
    
    private double width;
    private double length;

    public RoomDimension()
    {
        

    }

    public RoomDimension(double width, double length)
    {
        this.width = width;
        this.length = length;
    }

    public double getArea()
    {
        return width * length;
    }

    public String getString()
    {
    
        String w = width +" ft";
        String l = length+" ft";

        return w + " x " + l;


    }

    

}
