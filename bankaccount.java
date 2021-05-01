abstract class bankaccount
{
	double balance;
	int deposit;
	int withdraw;
	double interestrate;
	double annualinterst;
	double amu;
	double moninterest;
	
	public bankaccount(double bal,double rate)
	{
		balance=bal;
		annualinterst=rate;
	}
	public void setAmount(double myamount)
	{
		amu=myamount;
	}
	public void dep(double amountin)
	{
		balance=balance+amountin;
		deposit++;
	}
	public void withdraw1(double amu)
	{
		balance=balance-amu;
		withdraw++;
	}
	public double calcinterest()
	{
		double monrate;
		monrate=interestrate/12;
		moninterest=balance * monrate;
		balance=balance+moninterest;
		return balance;
	}
	public void monthprocess()
	{
		calcinterest();
		withdraw=0;
		deposit=0;
	}
	public double getbalance()
	{
		return balance;
	}
	public double getdeposit()
	{
		return deposit;
	}
	public double getwithdraw()
	{
		return withdraw;
	}
}
class savingaccount extends bankaccount
{
	public savingaccount(double b,double i)
	{
		super(b,i);
	}
	public boolean isactive()
	{
		if(balance>=25)
			return true;
			return false;
	}
	public void withdraw1()
	{
		if(isactive()==true)
		{
			super.withdraw1(amu);
		}
	}
	public void dep()
	{
		if(isactive()==true)
		{
			super.dep(amu);
		}
	}
}
class  currentaccount extends bankaccount
{
	public currentaccount(double b,double i)
	{
		super(b,i);
	}
	public boolean isactive()
	{
		if(balance>=25)
		return true;
		return false;
	}
	public void withdraw1()
	{
		if(isactive()==true)
		{
			super.withdraw1(amu);
		}
	}
	public void dep()
	{
		if(isactive()==true)
		{
			super.dep(amu);
		}
	}
}
public class TestDriver
{
	public static void main(String[] args)
	{
		savingaccount saving=new savingaccount(2000,0.20);
		currentaccount current=new currentaccount(2000,0.5);
		saving.withdraw1(200);
		saving.dep(500);
		saving.calcinterest();
		System.out.println(saving.getbalance());
		
		current.withdraw1(200);
		current.dep(500);
		current.calcinterest();
		System.out.println(current.getbalance());
		System.out.println("expected 1265.0");
	}
}