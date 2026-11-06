public class Main {

    public static void printAccountIds(BankAccount a1, BankAccount a2){
        System.out.println("Account 1 id: "+a1.getAccountId()+" Account 2 id: "+a2.getAccountId());
    }

    public static void main(String[] args){
        //1
        BankAccount account1 = new BankAccount("Owner1",550);
        BankAccount account2 = new BankAccount("Owner2",300);
        //2.
        System.out.println("Account 1 id: "+account1.getAccountId()+" Account 2 id: "+account2.getAccountId());
        //3.
        account1.deposit(500);
        //4.
        account2.withdraw(200);
        //5.
        account1.transferTo(account2,300);
        //6.
        account1.withdraw(1000);
        //7.
        System.out.println("Account 1 info:\n"+account1.getAccountInfo()+"\nAccount 2 info:\n"+account2.getAccountInfo());
        //8.
        printAccountIds(account1,account2);
        //9.
        System.out.println("Next id: "+BankAccount.getNextId());
        BankAccount account3 = new BankAccount("Owner3");
        System.out.println("Account 3 id: "+account3.getAccountId());
        //10.
        account1.deposit(-500);
        account1.transferTo(account1,300);
        //11.
        Bank bank = new Bank("Bank1",1);
        bank.setAccounts(account1,account2);
        System.out.println("Total bank balance: "+bank.getTotalBalance());
        System.out.println(bank.getBankInfo());
    }
}
