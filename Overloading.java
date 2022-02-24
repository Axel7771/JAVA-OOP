import javax.swing.text.ElementIterator;

public class Overloading {

    public int a, b, c;
    public String str;
    public char ch;

    //Constructors
    Overloading(){

    }

    Overloading(int a, int b, int c){

        this.a = a;
        this.b = b;
        this.c = c;

    }

    Overloading(char ch, int b){
        this.ch = ch;
        this.b = b;

    }

    Overloading(String str, int a){
        this.str = str;
        this.a = a;
    }

    //Overloading Methods

    public void max(int a, int b, int c){

        if (a > b & a > c )
        {
            System.out.println("Max value is a : " + a);
        }
        else if(b > a & b > c)
        {
            System.out.println("Max value is b : " + b);
        }
        else
        {
            System.out.println("Max value is c : " + c);
        }

    }
    public void max(String str, int a)
    {
        int str_to_int = Integer.parseInt(str);

        if (str_to_int > a)
        {
            System.out.println("Max value is : " + str_to_int);
        }
        else
            System.out.println("Max value is a : " + a);
    }
    public void max(char ch, int b)
    {
        if (ch > a) 
        {
            System.out.println("Max value is : " + ch);
        }
        else 
            System.out.println("Max Value is : " + b);
    }

}

