import java.util.Scanner;

public class AccountTest {

    public static void main(String[] args) {
        Account account1 = new Account("lukman oye",10000.00);
        Account account2 = new Account("sabo tuji",12000.00);

        displayAccount(account1);
        displayAccount(account2);



        Scanner input = new Scanner(System.in);
        System.out.print("Enter deposit amount for account1: "); // prompt

        double depositAmount = input.nextDouble();

            System.out.printf("%nadding %.2f to account1 balance%n%n",
                         depositAmount);
            account1.deposit(depositAmount);


        displayAccount(account1);
        displayAccount(account2);


        System.out.print("Enter deposit amount for account2: ");
              depositAmount = input.nextDouble();

              System.out.printf("%nadding %.2f to account2 balance%n%n",
                         depositAmount);
              account2.deposit(depositAmount);


            displayAccount1(account1);
            displayAccount(account2);

            double new_balance = account1.getBalance();
            double new_balance2 = account2.getBalance();



        System.out.println("Enter amount to withdraw from account1");
        double withdraw = input.nextDouble();
        if (withdraw>0.0&&withdraw<= account1.getBalance()){
            new_balance =new_balance-withdraw;
            System.out.printf("successful withdraw,your new balance from account1 is $%.2f%n",new_balance);
        }
        else {
            System.out.println("try Again");
        }
        System.out.println("Enter amount to withdraw from account2");
        withdraw = input.nextDouble();
        if (withdraw>0.0&&withdraw<= account2.getBalance()){
            new_balance2 = new_balance2 - withdraw;
            System.out.printf("successful withdraw,your new balance from account1 is $%.2f%n",new_balance2);
        }
        else {
            System.out.println("try Again");
        }

    }
    public static void displayAccount(Account account2){

        System.out.printf("%s balance: $%.2f%n%n",
                account2.getName(),account2.getBalance() );

    }

    public static void displayAccount1(Account account){

        System.out.printf("%s balance: $%.2f%n%n",
                account.getName(),account.getBalance() );

    }

}



