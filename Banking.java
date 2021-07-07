import java.util.*;
class Banking
{
	public static void main(String args[])
	{
		int amount,amt,ch;
		while(true)
		{
			System.out.println("\nEnter 1 to deposit\nEnter 2 to withdraw\nEnter 3 to check balance\nEnter 4 to exit");
			Scanner sc=new Scanner(System.in);
			ch=sc.nextInt();
			switch(ch)
			{
				case 1://deposit
				         System.out.println("Enter the deposit amount:");
						 amount=sc.nextInt();
						 Deposit.addMoney(amount);
						 System.out.println("\nThe amount successfully deposited");
						  break;
				case 2://withdraw
				        System.out.println("\nEnter the withdraw amount:");
						amt=sc.nextInt();
						Withdraw.debitMoney(amt);
						System.out.println("\nThe amount successfully withdrawn");
						  break;
				case 3://balance
                        Balance.checkMoney();
                          break;
                case 4:
                         System.exit(1);
                default:
				 System.out.println("\nInvalid choice!!!");
			}
		}
	}
}
class Deposit
{
	private static int a;
	static int addMoney(int amount)
	{
		a=a+amount;
		a=amount;
		return a;
	}
	static int presentMoney()
	{
          return a;
	}
}
class Withdraw
{
  static int debitMoney(int amt)
  { 
     int present,p; 
     present=Deposit.presentMoney();
     if(amt<=present)
     {
       p= Deposit.addMoney(present-amt);
	   return p;
	 }
     else
	 {
		 
       System.out.println("\nInsufficient money");
	   return(0);
	 }
  }
} 
class Balance
{
   static void checkMoney()
   {
	   System.out.println("\nThe balance is:"+Deposit.presentMoney());
   }
}
   
			