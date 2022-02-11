import javax.swing.JOptionPane;

//Driver Class TestEmployee Inputs/Outputs Employee data using JOptionpane

public class TestEmployee{

    public static void main(String[] args){

        //First Employee
        String name1 = JOptionPane.showInputDialog("Enter Employee Name");
        String strID1 = JOptionPane.showInputDialog("Enter Employee ID");
        int ID1 = Integer.parseInt(strID1);
        String position1 = JOptionPane.showInputDialog("Enter Employee Position");

        //Second Employee
        String name2= JOptionPane.showInputDialog("Enter Second Employee Name");
        String strID2 = JOptionPane.showInputDialog("Enter Second Employee ID");
        int ID2 = Integer.parseInt(strID2);
        String position2 = JOptionPane.showInputDialog("Enter Second Employee Position");
        //Third Employee
        String name3 = JOptionPane.showInputDialog("Enter Third Employee Name");
        String strID3 = JOptionPane.showInputDialog("Enter Third Employee ID");
        int ID3 = Integer.parseInt(strID3);
        String position3 = JOptionPane.showInputDialog("Enter Third Employee Position");
        
        //create new objects emp
        Employee emp1 = new Employee(name1, ID1, position1);
        Employee emp2 = new Employee(name2, ID2, position2);
        Employee emp3 = new Employee(name3, ID3, position3);
        //output Employee Name, ID, Position

        JOptionPane.showMessageDialog(null, "  Employee Name:\nEmployee 1: " + emp1.getName() + "\nEmployee 2: "+ emp2.getName() + "\nEmployee 3: " + emp3.getName());
        JOptionPane.showMessageDialog(null, "  Employee ID:\n" + emp1.getName() + ":" + emp1.getID() + "\n" + emp2.getName() + ":" + emp2.getID() + "\nEmployee 3: " + emp3.getID());
        JOptionPane.showMessageDialog(null, "  Employee Position:\nEmployee 1: " + emp1.getPos() + "\nEmployee 2: "+ emp2.getPos() + "\nEmployee 3: " + emp3.getPos());
       

    }

}