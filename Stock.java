import java.util.*;
public class Stock {
	
	static void displayAscending(StockHolding array[])
	{
		for(int i=0;i<array.length;i++)
		{
			for(int j=1;j<array.length;j++)
			{
				if(array[j].companyName.compareTo(array[j-1].companyName)<0)
				{
					StockHolding temp;
					temp=array[j];
					array[j]=array[j-1];
					array[j-1]=temp;
				}
			}
		}
		System.out.println("Display Stock in Ascending Order by Name");
		for(int i=0; i<array.length; i++)
		{
			System.out.println("Company Name : "+array[i].companyName);
			System.out.println("Purchase Share Price : "+array[i].purchaseSharePrice);
			System.out.println("Current Share Price : "+array[i].currentSharePrice);
			System.out.println("Number of Shares : "+array[i].numberOfShares);
			System.out.println();
		}
	}
	
	//display foreign stock in descending order
	static void displayDescending(ForeignStockHolding array[])
	{
		for(int i=0;i<array.length;i++)
		{
			for(int j=1;j<array.length;j++)
			{
				if(array[j].companyName.compareTo(array[j-1].companyName)>0)
				{
					ForeignStockHolding temp;
					temp=array[j];
					array[j]=array[j-1];
					array[j-1]=temp;
				}
			}
		}
		System.out.println("Display Stock in Descending Order by Name");
		for(int i=0; i<array.length; i++)
		{
			System.out.println("Company Name : "+array[i].companyName);
			System.out.println("Purchase Share Price : "+array[i].purchaseSharePrice);
			System.out.println("Current Share Price : "+array[i].currentSharePrice);
			System.out.println("Number of Shares : "+array[i].numberOfShares);
			System.out.println("Conversion Rate: "+ array[i].conversionRate);
			System.out.println();
		}
	}
	
	static void displayMinValue (ForeignStockHolding array[])
	{
		//temp object of Foreign stock holding for minimum value 
		ForeignStockHolding temp = array[0];		
		
		for(int i=0;i<array.length;i++)
		{
			if(temp.valueInDollars() > array[i].valueInDollars())
			{
				temp = array[i];
			}
		}
		System.out.println("Minimum Value of Stock: ");
		System.out.println("Company Name : "+temp.companyName);
		System.out.println("Purchase Share Price : "+temp.purchaseSharePrice);
		System.out.println("Current Share Price : "+temp.currentSharePrice);
		System.out.println("Number of Shares : "+temp.numberOfShares);
		System.out.println("Conversion Rate: "+ temp.conversionRate);
		System.out.println();
	}
	
	static void displayMaxValue(ForeignStockHolding array[])
	{
		//temporary object of Foreign stock holding for max profitable stock 
		ForeignStockHolding temp = array[0];		
		
		for(int i=0;i<array.length;i++)
		{
			if((temp.valueInDollars()-temp.costInDollars()) < (array[i].valueInDollars()-temp.costInDollars()))
			{
				temp = array[i];
			}
		}
		System.out.println("Maximum Profitable Stock: ");
		System.out.println("Company Name : "+temp.companyName);
		System.out.println("Purchase Share Price : "+temp.purchaseSharePrice);
		System.out.println("Current Share Price : "+temp.currentSharePrice);
		System.out.println("Number of Shares : "+temp.numberOfShares);
		System.out.println("Conversion Rate: "+ temp.conversionRate);
		System.out.println();
	}
	
	static void displayMinProfitable(ForeignStockHolding array[])
	{
		//temporary object of Foreign stock holding for minimum profitable stock 
		ForeignStockHolding temp = array[0];		
		
		for(int i=0;i<array.length;i++)
		{
			if((temp.valueInDollars()-temp.costInDollars()) > (array[i].valueInDollars()-temp.costInDollars()))
			{
				temp = array[i];
			}
		}
		System.out.println("Minimum Profitable Stock: ");
		System.out.println("Company Name : "+temp.companyName);
		System.out.println("Purchase Share Price : "+temp.purchaseSharePrice);
		System.out.println("Current Share Price : "+temp.currentSharePrice);
		System.out.println("Number of Shares : "+temp.numberOfShares);
		System.out.println("Conversion Rate: "+ temp.conversionRate);
		System.out.println();
	}
	
	static void displayMaxProfitable(ForeignStockHolding array[])
	{
		//temporary object of Foreign stock holding for max profitable stock 
		ForeignStockHolding temp = array[0];		
		
		for(int i=0;i<array.length;i++)
		{
			if((temp.valueInDollars()-temp.costInDollars()) < (array[i].valueInDollars()-temp.costInDollars()))
			{
				temp = array[i];
			}
		}
		System.out.println("Maximum Profitable Stock: ");
		System.out.println("Company Name : "+temp.companyName);
		System.out.println("Purchase Share Price : "+temp.purchaseSharePrice);
		System.out.println("Current Share Price : "+temp.currentSharePrice);
		System.out.println("Number of Shares : "+temp.numberOfShares);
		System.out.println("Conversion Rate: "+ temp.conversionRate);
		System.out.println();
	}
	

	static void displayAscending(ForeignStockHolding array[])
	{
		for(int i=0;i<array.length;i++)
		{
			for(int j=1;j<array.length;j++)
			{
				if(array[j].companyName.compareTo(array[j-1].companyName)<0)
				{
					ForeignStockHolding temp;
					temp=array[j];
					array[j]=array[j-1];
					array[j-1]=temp;
				}
			}
		}
	//print ascending order by company name
		System.out.println("Display Stock in Ascending Order by Name");
		for(int i=0; i<array.length; i++)
		{
			System.out.println("Company Name : "+array[i].companyName);
			System.out.println("Purchase Share Price : "+array[i].purchaseSharePrice);
			System.out.println("Current Share Price : "+array[i].currentSharePrice);
			System.out.println("Number of Shares : "+array[i].numberOfShares);
			System.out.println("Conversion Rate: "+ array[i].conversionRate);
			System.out.println();
		}
	}
	
	
	static void displayInSortedValueOrder(ForeignStockHolding array[])

	{
		for(int i=0;i<array.length;i++)
		{
			for(int j=1;j<array.length;j++)
			{
				if(array[j].valueInDollars() < array[j-1].valueInDollars())
				{
					ForeignStockHolding temp;
					temp=array[j];
					array[j]=array[j-1];
					array[j-1]=temp;
				}
			}
		}
	//print ascending order 
		System.out.println("Display Stock in Ascending Order by value");
		for(int i=0; i<array.length; i++)
		{
			System.out.println("Company Name : "+array[i].companyName);
			System.out.println("Purchase Share Price : "+array[i].purchaseSharePrice);
			System.out.println("Current Share Price : "+array[i].currentSharePrice);
			System.out.println("Number of Shares : "+array[i].numberOfShares);
			System.out.println("Conversion Rate: "+ array[i].conversionRate);
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StockHolding stockHoldingArray[] = new StockHolding[3];
		
		stockHoldingArray[0] = new StockHolding((float)2.30, (float)4.50, (int)40, "XYZ limited");
		stockHoldingArray[1] = new StockHolding((float)12.19, (float)10.56, (int)90, "ABC Pvt Limited");
		stockHoldingArray[2] = new StockHolding((float)45.10, (float)49.51, (int)210, "United States Limited");
		
		//function to display in alphabetical order
		displayAscending(stockHoldingArray);
		
		//array of ForeignStockHolding
		ForeignStockHolding [] 	foreignStockHolding = new ForeignStockHolding[3];
		
		foreignStockHolding[0] = new ForeignStockHolding((float)2.30, (float)4.50, (int)40, "XYZ limited", (float)0.94);
		foreignStockHolding[1] = new ForeignStockHolding((float)12.19, (float)10.56, (int)90, "ABC Pvt Limited", (float)1.10);
		foreignStockHolding[2] = new ForeignStockHolding((float)45.10, (float)49.51, (int)210, "United States Limited", (float)1.25);
		
		//function to display in reverse alphabetical order
		displayDescending(foreignStockHolding);
		
		//taking no of stocks as input not more than 8
		Scanner input = new Scanner(System.in);
		
		int noOfStocks;
		System.out.println("Enter no of Stock less than 9");
		noOfStocks = input.nextInt();
		
		//declaring array of foreign stock holding as per user requirement.
		ForeignStockHolding userStockHolding[] = new ForeignStockHolding[noOfStocks];
		
		
		for(int i=0; i < noOfStocks; i++)
		{
			//for type of stock user wants
			int typeOfStock;
			System.out.println("1. Stock Holding \n2. Foreign Stock Holding");
			typeOfStock = input.nextInt();
			
			//declaring the variable for no of purchase and current share price
			float prshpr, crshpr, cnv;

			//declaring the  variable for no of stocks
			int nos;
			
			//declaring the variable for name of company
			String name;
			
			System.out.print("Enter Purchase Rate");
			prshpr = input.nextFloat();
			System.out.print("Enter Current Rate");
			crshpr= input.nextFloat();
			System.out.print("Enter no of Shares");
			nos = input.nextInt();
			System.out.print("Enter Company Name");
			name = input.next();
			
			//if stock is of StockHOlding then take conversion rate is 1 else take input from user
			if(typeOfStock == 1)
			{
				cnv = 1;
			}
			else
			{
				System.out.print("Enter the conversin rate for Foreign Stock");
				cnv = input.nextFloat();	
			}
			
			//initialize the stock type as per user requirement
			userStockHolding[i] = new ForeignStockHolding(prshpr, crshpr, nos, name, cnv);
		
		}
		
		//a variable of boolean type
		boolean value = true;
		
		//continue loop until user don't want to end
		while(value)
		{
			System.out.println("Enter your choice: \n \n" + 
					"    1) Display stock information with the lowest value\n" + 
					"    2) Display stock with the highest value\n" + 
					"    3) Display the most profitable stock\n" + 
					"    4) Display the least profitable stock\n" + 
					"    5) List all stocks sorted by company name (A-Z)\n" + 
					"    6) List all stocks sorted from the lowest value to the highest value\n" + 
					"    7) Exit");
		
		//variable for choice
		int choice = input.nextInt();
		
		switch(choice)
		{
		case 1:{
			displayMinValue(userStockHolding);
			break;
		}
		case 2: {
			displayMaxValue(userStockHolding);
			break;
		}
		case 3:{
			displayMaxProfitable(userStockHolding);
			break;
		}
		case 4: {
			displayMinProfitable(userStockHolding);
			break;
		}
		case 5: {
			displayAscending(userStockHolding);
			break;
		}
		case 6:{
			displayInSortedValueOrder(userStockHolding);
			break;
		}
		case 7:{
			value = false;
			break;
		}
		}
		}
				
	}

}
