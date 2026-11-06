public class BankAccount {
    //account properties
    private int accountId;
    private String ownerName;
    private double balance;
    private boolean isActive;

    //static variables
    private static int nextId = 1000;
    private static int totalAccounts = 0;

    public BankAccount(String ownerName){
        this.ownerName = ownerName;
        this.balance = 0;
        this.isActive = true;
        this.accountId = nextId;
        BankAccount.nextId++;
        BankAccount.totalAccounts++;
    }

    public BankAccount(String ownerName ,double initialBalance) {
        this.ownerName = ownerName;
        this.balance = initialBalance>0 ? initialBalance: 0;
        this.isActive = true;
        this.accountId = nextId;
        BankAccount.nextId++;
        BankAccount.totalAccounts++;
    }

    public int getAccountId(){return this.accountId;}
    public String getOwnerName(){return this.ownerName;}
    public double getBalance(){return  this.balance;}
    public boolean getActive(){return this.isActive;}
    public static int getNextId(){return BankAccount.nextId;}
    public static int getTotalAccounts(){return BankAccount.totalAccounts;}


    public boolean setOwnerName(String newName){
        if(newName==""){
            System.out.println("Invalid name");
            return false;
        }
        this.ownerName = newName;
        return true;
    }

    private static boolean isValidAmount(double amount){
        return amount>0;
    }

    public boolean deposit(double amount){
        if(!isValidAmount(amount)){
            System.out.println("Invalid amount");
            return false;
        }
        if(!this.isActive){
            System.out.println("Inactive account");
            return false;
        }
        System.out.println("Deposit Successful");
        this.balance += amount;
        return true;
    }

    public boolean withdraw(double amount){
        if(!isValidAmount(amount) || amount>this.balance){
            System.out.println("Invalid amount or insufficient funds");
            return false;
        }
        if(!this.isActive){
            System.out.println("Inactive account");
            return false;
        }
        System.out.println("Withdraw Successful");
        this.balance -= amount;
        return true;
    }

    public boolean transferTo(BankAccount destination, double amount){
        if(!isValidAmount(amount)|| destination==null || destination==this || this.balance<amount){
            System.out.println("Invalid amount ,destination or insufficient funds");
            return false;
        }
        if(!this.isActive || !destination.isActive){
            System.out.println("One or more of the accounts is inactive");
            return false;
        }
        System.out.println("Transfer Successful");
        destination.balance += amount;
        this.balance -= amount;
        return true;
    }

    public boolean closeAccount(){
        if(this.isActive&&this.balance == 0){
            this.isActive = false;
            System.out.println("Account close Successful");
            return  true;
        }
        System.out.println("Account close Failed,Account is already active or balance isnt 0");
        return false;
    }

    public String getAccountInfo(){
        return ("Account id: "+this.accountId+"\nOwner name: "+this.ownerName+"\nBalance: "+this.balance+"\nActive: "+this.isActive);
    }

}
