class BankAccount {
	static java.util.Scanner sc=new java.util.Scanner(System.in);
    private String accountNumber;
    private String accountHolder;
    private double balance; 
    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    } 
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } 
		else {
            System.out.println("Deposit amount must be positive.");
        }
    } 
    public void withdrawal(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        }
		else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } 
		
		else {
            System.out.println("Withdrawal amount must be positive.");
        }
    } 
    public void display() {
        System.out.println("Account Balance: $" + balance);
    } 
    
	public static void main(String[] args) { 
        BankAccount obj = new BankAccount(sc.next(),sc.next(),sc.nextDouble());
	System.out.println("1. Display Amount \n 2.Enter Amount to Deposit \n 3.Enter to Withdraw the Amount");
		
         
		 boolean x=true;
		  while(x){
			  int choice=sc.nextInt();
		 switch(choice)
		 {
            
			 case 1:
			 obj.display(); 
			 break;
			 case 2:
			 obj.deposit(sc.nextDouble());
			 obj.display();
			 break;
			 case 3:
			 obj.withdrawal(sc.nextDouble());
			 obj.display();
			 break;
			 case 0:
			 x=false;
			 break;
		   }
		 }

        
        
         
        
    }
}
