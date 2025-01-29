package chapter3dieteltextbook.PetrolAndPetrolPurchaseExercise12;

public class PetrolPurchase{
	private String stationLocation;
	private String petrolType;
	private int quantityInLiters;
	private double pricePerLiter;
	private double percentageDiscount;

	public PetrolPurchase(String stationLocation, String petrolType, int quantityInLiters, double pricePerLiter, double percentageDiscount){
		
		this.stationLocation = stationLocation;
		this.petrolType = petrolType;

		if(quantityInLiters > 0){
			this.quantityInLiters = quantityInLiters;
		}

		if(pricePerLiter > 0){
			this.pricePerLiter = pricePerLiter;
		}

		if(percentageDiscount < 100){
			percentageDiscount /= 100;
			this.percentageDiscount = percentageDiscount;
		}
	}

	public void setStationLocation(String stationLocation){
		this.stationLocation = stationLocation;
	}

	public String getStationLocation(){
		return stationLocation;
	}

	public void setPetrolType(String petrolType){
		this.petrolType = petrolType;
	}

	public String getPetrolType(){
		return petrolType;
	}

	public void setQuantityInLiters(int quantityInLiters){
		this.quantityInLiters = quantityInLiters;
	}

	public int getQuantityInLiters(){
		return quantityInLiters;
	}

	public void setPricePerLiter(double pricePerLiter){
		this.pricePerLiter = pricePerLiter;

	}

	public double getPricePerLiter(){
		return pricePerLiter;
	}

	public void setPercentageDiscount(double percentageDiscount){
		percentageDiscount /= 100;
		this.percentageDiscount = percentageDiscount;

	}

	public double getPercentageDiscount(){
		return percentageDiscount;
	}

	public double getPurchaseAmount(){
		double netPurchaseAmount = quantityInLiters * pricePerLiter - percentageDiscount;
		return netPurchaseAmount;
	}
}