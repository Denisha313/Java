public class addition
{
	private double no1,no2,ans;
	public addition()
	{
		no1=0;
		no2=0;
		ans=0;
	}
	public addition(double n1,double n2)
	{
		this.no1=n1;
		this.no2=n2;
	}
	public double getNo1()
	{
		return no1;
	}
	public void setNo1(double n1)
	{
		this.no1=n1;
	}
	public double getNo2()
	{
		return no2;
	}
	public void setNo2(double n2)
	{
		this.no2=n2;
	}
	public double getsum()
	{
		ans=dosum();
		return ans;
	}
	public double dosum()
	{
		ans=no1+no2;
		return ans;
	}
}