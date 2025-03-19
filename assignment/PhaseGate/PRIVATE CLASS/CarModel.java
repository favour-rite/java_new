public class CarModel{
	public static void main(){

		String model;
		String year;
		double price;


	public CarModel(String model,String year,double price)
	{
			
		this.model = model;
		this.year = year;
		this.price = price;
	}


	public void setyear(String year){
		this year = year;
	}
	public void setprice(double price){
		this price = price;
	}
	public void setprice(double newPrice)
	{	
		if (price < 0){
			setprice = newPrice;
		}
	}


	public getcarType()
	{
		return model;
	}
	public String getyear()
	{
		return year;
	}
	public double getprice()
	{
		return price;
	}
	

	}


}