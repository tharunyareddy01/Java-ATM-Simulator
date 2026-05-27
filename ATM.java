class Proj{
    private double balance;
    private double withdraw;
    private int deposit;
    private int atmNum;
    public void setAtmNum(int pin){
        this.atmNum=pin;
    }
    public void setBalance( double balance){
           this.balance=balance;
    }
     public void setWithdraw( double withdraw){
           this.withdraw=withdraw;
    }
     public void deposit( int deposit){
           this.deposit=deposit;
    }
    
     public int getAtmNum(){
        return atmNum;
    }

      public double getBalance(){
           return balance;
    }
      public int getDeposit(){
           return deposit;
    }
     public double getWithdraw(){
           return withdraw;
    }
    public void checkBalance(){
        System.out.println("Your Balance is "+ balance);
    }
    public void depositAmount(int deposit){
        balance=balance+deposit;
        System.out.println("Balance after deposited amount is "+balance);
    }
    public void withdrawAmount(double withdraw){
        if(balance>withdraw){
            balance=balance-withdraw;
            System.out.println("Amount witdrawn is "+withdraw);
            System.out.println("Balance after withdrawn amount is "+getBalance());
        }
        else{
            System.out.println("Insufficient Balance !!");
        }
    }

}
class ATM{
    public static void main(String args[]){
        java.util.Scanner sc=new java.util.Scanner(System.in);
        Proj p=new Proj();
        p.setBalance(50000.00);
        int atmpin=578643;
        System.out.println("Enter your pin number");
        int pin=sc.nextInt();
        if(pin==atmpin){
            System.out.println("okay");
        int choice;
        do{
            System.out.println("--------------------");
        System.out.println("enter your choice");
        System.out.println("1.Check Balance");
        System.out.println("2.Withdraw Amount");
        System.out.println("3.Deposit Amount");
        System.out.println("4.Exit");
        System.out.println("---------------------");
      
        System.out.println("enter your choice");
        choice=sc.nextInt();
        switch(choice){
            case 1:
                p.checkBalance();
                break;
            case 2:
                System.out.println("enter amount to be withdrawn");
                double amt=sc.nextDouble();
                p.withdrawAmount(amt);
                break;
            case 3:
                System.out.println("Enter amount to be deposited");
                int amount=sc.nextInt();
                p.depositAmount(amount);
                break;
            case 4:
                System.out.println("THANK YOU!");
                break;  
            default:
                System.out.println("ERROR");                
        }
    }while(choice!=4);
}
else{
    System.out.println("Wrong pin number");
}
    sc.close();
    }
}