public class Bank {
    private String bankName;
    private int bankCode;
    private BankAccount account1;
    private BankAccount account2;

    public Bank(String bankName, int bankCode){
        this.bankName = bankName;
        this.bankCode = bankCode;
    }

    public boolean setAccounts(BankAccount account1,BankAccount account2){
        if(account1==null || account2 == null){
            System.out.println("Invalid accounts");
            return false;
        }
        this.account1 = account1;
        this.account2 = account2;
        return true;
    }

    public double getTotalBalance(){return this.account1.getBalance() + this.account2.getBalance();}

    public String getBankName(){return this.bankName;}

    public String getBankInfo(){
        return ("Bank name: "+this.bankName+"\nBank code: "+this.bankCode+
                "\n---Account 1 info-----\n"+this.account1.getAccountInfo()+
                "\n---Account 2 info-----\n"+this.account2.getAccountInfo()
                );
    }

}
