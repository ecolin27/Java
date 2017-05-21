package Compiled;
public class BankAccount
{
	
   // What do you mean changes are needed
   // Oh I see , I made the change 
   int Bank_Account_Num;
	char First_Name;
	char Last_Name;
	double balance;
	boolean Fees_Apply;
	String password;
	
	public void Record()
	{
		Bank_Account_Num = 0;
		First_Name = ' ';
		Last_Name = ' ';
		balance = 0.0;
		password = " ";
	}
	
	public void Record(int ban, char fn, char ln, double b, String p)
	{
		Bank_Account_Num = ban;
		First_Name = fn;
		Last_Name = ln;
		balance = b;
		password = p;
	}
	
	public int getAccountNum()
	{
		return Bank_Account_Num;
	}
	
	public char getFirstName()
	{
		return First_Name;
	}
	
	public char getLastName()
	{
		return Last_Name;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public void setAccountNum(int an)
	{
		Bank_Account_Num = an;
	}
	
	public void setFirstName(char f)
	{
		First_Name = f;
	}
	
	public void setLastName(char l)
	{
		Last_Name = l;
	}
	
	public void setBalance(double ba)
	{
		balance = ba;
	}
	
	public void setPassword(String pa)
	{
		password = pa;
	}
}
