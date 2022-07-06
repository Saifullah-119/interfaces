interface Bank
{
	float rateOfInterest();
}
class SBI implements Bank
{
	public float rateOfInterest()
	{
		return 9.15f;
	}
}
class PNB implements Bank
{
	public float rateOfInterest()
	{
		return 9.7f;
	}
}
public class BankInt
{
	public static void main(String[] uments)
	{
		SBI bsbi= new SBI();
		PNB bpnb= new PNB();
		System.out.println("Rate of Interest in SBI is: " + bsbi.rateOfInterest()+ "\nRate of Interest in PNB is: " +bpnb.rateOfInterest());
	}
}