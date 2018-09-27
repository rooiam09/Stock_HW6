
public class StockHolding 
{
	float purchaseSharePrice;
	float currentSharePrice;
	int numberOfShares;
	String companyName;
	
	StockHolding(float prshpr,float crshpr, int nos, String name)
	{
		purchaseSharePrice=prshpr;
		currentSharePrice=crshpr;
		numberOfShares=nos;
		companyName=name;
	}
	
	
	public float costInDollars() {
		
		return (purchaseSharePrice*numberOfShares);
	}
	
	public float valueInDollars() {
	
		return currentSharePrice*numberOfShares;
	}
}
