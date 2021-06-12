import java.util.Scanner;

public class BankingApplication 
{
   public static void main(String[] args) {
   
   }
}

class BankAccount
{
   int customerName = 0;
   int custID = 0;
   int priorTransactions = 0;
   int amount = 0;
   int balance = 0;
   int option = 0;
   
 
   
   void deposit(int amount)
   {
      if(amount > 0)
      {
      balance = balance + amount;
      priorTransactions = amount;
      }
   }
   void withdraw(int amount)
   {
      if(amount != 0)
      {
      balance = balance - amount;
      priorTransactions = amount;
      }
   {
   // priorTransactions;
   {
      if(priorTransactions > 0)
      {
         System.out.println("You have deposited: " + priorTransactions);
      }
      else if(priorTransactions < 0)
      {
         System.out.println("You have withdrawn: " + Math.abs(priorTransactions));
      }
      else
      {
         System.out.println("No transaction available");
      }
   }
   }
   
   Scanner keyboard = new Scanner(System.in);
   
   //showMenu
   {
      char option='\0';
      
      
      System.out.println("Welcome " + customerName);
      System.out.println("Your ID is " + custID);
      System.out.println("\n");
      System.out.println("\t1. Check Balance");
      System.out.println("\t2. Deposit");
      System.out.println("\t3. Withdraw");
      System.out.println("\t4. Prior Transaction");
      System.out.println("\t5. Exit");
     
     do
     {
      System.out.println("===========================================================");
      System.out.println("Select an option: ");
      System.out.println("===========================================================");
      System.out.print("\n");
      
      switch(option)
      {
      case '1':
         System.out.println("--------------------------");
         System.out.println("Balance = " + balance);
         System.out.println("--------------------------");
         System.out.println("\n");
         break;
         
      case '2':
         System.out.println("--------------------------");
         System.out.println("Enter amount to deposit: ");
         System.out.println("--------------------------");
         deposit(amount);
         System.out.println("\n");
         break;
         
      case '3':
         System.out.println("--------------------------");
         System.out.println("Enter amount to withdraw: ");
         System.out.println("--------------------------");
         System.out.println("\n");
         break;
         
      case '4':
         System.out.println("---------------------------");
         System.out.println("---------------------------");
         System.out.println("\n");
         break;
         
      default:
         System.out.println("Error: Please try again");
         
      }
    }while(option != '5');
    
    System.out.println("Thank you for banking with us!");
    }
  }
  }
      
 