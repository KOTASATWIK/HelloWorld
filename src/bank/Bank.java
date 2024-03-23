package bank;

public class Bank {
    String name = "satwik";
    double avilableBalance = 500.7;
    long accountNumber = 767586386635l;

    public void transferAmount(double amount){
        avilableBalance= avilableBalance-amount;
        System.out.println(avilableBalance);
    }


    public static void main(String[]args){
        Bank bank = new Bank();
//        System.out.println(bank.name);
//        System.out.println(bank.avilableBalance);
//        System.out.println(bank.accountNumber);
        bank.transferAmount(257.56);



        }


}
