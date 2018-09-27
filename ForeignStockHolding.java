
public class ForeignStockHolding extends StockHolding
{
	float conversionRate;
	ForeignStockHolding(float prshpr, float crshpr, int nos, String name, float cnv) 
	{
		super(prshpr, crshpr, nos, name);
		// TODO Auto-generated constructor stub
		conversionRate=cnv;
	}
	
	
	public float costInDollars() {
		
		return (purchaseSharePrice*numberOfShares*conversionRate);
	}

	
	public float valueInDollars() {
	
		return currentSharePrice*numberOfShares*conversionRate;
	}

}
