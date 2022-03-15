import java.util.Scanner;

class CashPayment extends Payment{

    public double cash;

    public CashPayment()
    {

    }

    public CashPayment(double cash)
    {
        this.cash = cash;
    }


}

class CreditCardPayment extends Payment
{
    public String notc;
    public int exp_date;
    public int cc_num;

    public CreditCardPayment()
    {

    }

    public CreditCardPayment(String notc, int exp_date, int cc_num)
    {

        this.notc = notc;
        this.exp_date = exp_date;
        this.cc_num = cc_num;

    }



}


public class PaymentDemo {


    public static void main(String[] args)
    {   
        Scanner keyboard = new Scanner(System.in);
        int choice = 0;
        double pay;

        while(choice != 3)
        {
            System.out.println("=======Payment DEMO=======");
            System.out.println("Choose Payment Type: \n 1. Cash \n 2. Credit \n 3. Exit");
            choice = keyboard.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter Cash payment: ");
                    pay = keyboard.nextDouble();
                    CashPayment cp = new CashPayment(pay);
                    cp.setPayment(pay);
                    cp.paymentDetail();
                   

                    break;
                case 2:
                    System.out.println("Credit Card Payment");
                    System.out.print("Name on the card: ");
                    String cc_name = keyboard.nextLine();

                    System.out.print("\nExperition date on the card: ");
                    int exp_date = keyboard.nextInt();

                    System.out.print("\nCredit Card Number: ");
                    int acc_num = keyboard.nextInt();

                    CreditCardPayment cc = new CreditCardPayment(cc_name, exp_date, acc_num);
                    cc.paymentDetail(cc_name, exp_date, acc_num);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                
            }

        }
      
    }
    

}
