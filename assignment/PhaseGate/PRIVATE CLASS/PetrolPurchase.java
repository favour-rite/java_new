public class PetrolPurchase{

	String stationLocation;
	String petrolType;
	int quantity;
	double pricePerLiter;
	double percentageDiscount;

	public PetrolPurchase(String stationLocation, String petrolType,
			      int quantity, double pricePerLiter, double percentageDiscount)
	{
		this.stationsLocation =  stationLocation;
		this.petrolType = petrolType;
		this.quantity = quantity;
		this.pricePerLiter = pricePerLiter;
		this.percentageDiscount = percentageDiscount;	
		
	}

	public void setstationLocation()
	{

	}
	public String getstationLocation()
	{

		return  stationLocation;
	}
	public String getpetrolType()
	{
		return  petrolType;
	}
	public int getquanitty()
	{
		return  quantity;
	}
	public double get pricePerLiter()
	{				
		return  pricePerLiter;
	}
	public double getpercentageDiscount()
	{
		return 	percentageDiscount;

	}	
	public getpuchaseAmount()
	{
		double netPurchaseAmount = (quantity * pricePerLiter) - percentageDiscount;
		return netAmount * netAmount; 
	}
	




	


}