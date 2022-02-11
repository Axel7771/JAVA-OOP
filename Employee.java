
public class Employee {

    public String name;
    public int ID;
    public String position;

    public Employee(){
        this.ID = 0;
    }
    public Employee(String name1, int ID1, String position1){
        
        this.name = name1;
        this.ID = ID1;
        this.position = position1;

    }

    public String getName(){
        return name;
    }
    public int getID(){
      
        return ID;
    }
    public String getPos(){
        return position;
    }

}
