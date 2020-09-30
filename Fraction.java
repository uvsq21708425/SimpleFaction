
public class Fraction
{
	private int num;
	private int denum;
	
	public Fraction(int num, int denum)
	{
		this.num=num;
		this.denum=denum;
	}
	
	public String toString()
	{
		return num + "/" + denum;
	}
}
