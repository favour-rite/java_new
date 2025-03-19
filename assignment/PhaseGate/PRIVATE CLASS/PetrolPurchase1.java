public class PetrolPurchase1{
	
		String stationLocation;
		String petrol;
		int quantityInLitter;
		double pricePerLiter;
		double percentageDiscount;

	
	public PetrolPurchase1(String location, String petrol,
			int quantityInLitter,
			double pricePerLiter,
			double percentageDiscount){
	
		stationLocation = location;
		this.petrol = petrol;
		this.quantityInLitter = quantityInLitter;
		this.pricePerLiter = pricePerLiter;
		this.percentageDiscount = percentageDiscount;

	}


	public void setstationLocation(String location){
		this.stationLocation = location;
	}
	public void setpetrol(String petrol){
		this.petrol = petrol;
	}
	public void setquantityInLitter(int quantity){
		this.quantityInLitter = quantity;
	}
	public void setpricePerLiter(double price){
		this.pricePerLiter = price;
	}
	public void setpercentageDiscount(double discount){
		this.percentageDiscount = discount;
	}


	public String getstationLocation(){
		return stationLocation;
	}
	public String getpetrol(){
		return petrol;
	}
	public int getquantityInLitter(){
		return quantityInLitter;
	}
	public double getpricePerLiter(){
		return pricePerLiter;
	}
	public double getpercentageDiscount(){
		return percentageDiscount;
	}
}