/*class CashPayment{

    public double cash;

    public CashPayment()
    {

    }

    public CashPayment(double cash)
    {
        this.cash = cash;
    }

    public double getCashPayment(double cash){
        
        return cash;

    }

}*/






public class Payment {

    private double pay_ment;
    CashPayment cash;

    public Payment()
    {

    }

    public Payment(CashPayment cash, double pay_ment)
    {
        this.cash = cash;
        this.pay_ment = pay_ment;
    }

    public void setPayment(double pay_ment){

        if (pay_ment != 0.0 | pay_ment != 0)
        {
            this.pay_ment = pay_ment;
        }
        else
        {
            System.out.println("Error: Payment not Valid! \n Exiting...");
            System.exit(1);
        }

    }
    
   
    public double getPayment(double pay_ment)
    {
        return pay_ment;
    }


    public void paymentDetail()
    {
        System.out.println("payment amount is: $ " + pay_ment + " ");
    }

    public void paymentDetail(CashPayment cash, double pay_ment)
    {
        System.out.println("payment cash ammount: " + pay_ment);
    }

    public void paymentDetail(String x, int y , int z){

        System.out.println("Credit Card Payment: " + x + '\n' + y + '\n' + z + '\n');
    }

}




