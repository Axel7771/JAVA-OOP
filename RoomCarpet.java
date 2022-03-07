public class RoomCarpet {

    RoomDimension size;
    double carpet_cost;
    

    public RoomCarpet()
    {

    }

    public RoomCarpet(RoomDimension size, double carpet_cost)
    {
        
        this.size = size;
        this.carpet_cost = carpet_cost;

    }

    public double getTotalCost()
    {
        Double A = size.getArea();
        return A * carpet_cost;

    }
    public String getString()
    {
        String d1 = size.getString();
        String carp_cost = "$" + carpet_cost;
        return d1 + " x " + carp_cost;

    }
    
}
