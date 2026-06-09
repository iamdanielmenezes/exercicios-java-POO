package entities;

public class ImportedProduct extends Product{
	
	private double customsFee; 
	
	public ImportedProduct() {
	}

	public ImportedProduct(String name, double price, double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public double getCustomsFree() {
		return customsFee;
	}

	public void setCustomsFree(double customsFree) {
		this.customsFee = customsFree;
	}
	
	@Override
	public String priceTag() {
		return super.priceTag() + " (Customs Fee: $ " + customsFee + ")";
	}
	 
}
