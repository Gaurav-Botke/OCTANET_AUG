import java.util.Scanner;

class BankAccount{
  private int balance;

  public BankAccount(int initialAmmount){
    this.balance = initialAmmount;
  }
   
  public int balance(){
        return balance;
  }

  public void deposite(int amount){
    if(amount>0){
      balance += amount;
      System.out.println("Deposite of "+amount+" Rs was successfully !");
    }
    else{
      System.out.println("Invalide entry !. Please choose number above 0");
    }
  }

  public void withdraw(int amount){
    if (amount > 0 && amount <= balance){
      System.out.println("Withdraw Successfully of " +amount+" Rs");
      amount -= balance;
    }
    else{
      System.out.println("Invalid entry ! Insuffucient balance or negative entry");
    }
  }
}
class ATM{

  private BankAccount account;
  public ATM(BankAccount account){
    this.account = account;
  }
public void dispaly(){
  System.out.println("Select Option");
  System.out.println("1. Deposite");
  System.out.println("2. Withdraw");
  System.out.println("3.Check Balance");
  System.out.println("4.exit");
}

public void run(){
  Scanner sc = new Scanner(System.in);
  int option;
  do{
    dispaly();
    System.out.println("Pick an Option");
    option = sc.nextInt();

      switch (option){
        case 1:
             System.out.println("Enter amount to deposite");
             int depositeAmount = sc.nextInt();
             account.deposite(depositeAmount);
             break;  
             
       case 2:
             System.out.println("Enter amount to withdraw");
             int withdrawAmount = sc.nextInt();
             account.withdraw(withdrawAmount);
             break;
       case 3:
             System.out.println("Current Balnace : " +account.balance()+" Rs");
             break;
             
       case 4:
             System.out.println("Thanks for working with SBI Bank");
             break;
       default:
             System.out.println("Invalide entry !! Enter only the given option");                       
      }
  }while(option != 4);
sc.close();;
}
}

public class ATMInteface{
  public static void main(String[] args){
    BankAccount userAccount = new BankAccount(3000);
    ATM atm = new ATM(userAccount);
    atm.run();


  }
 }

