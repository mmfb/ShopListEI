package pt.iade.shoplist.models;

public class ImportedProduct extends Product {
	protected String country;
	protected String importer;
	public ImportedProduct(String name, double price, 
			String country, String importer) {
		super(name, price);
		this.country = country;
		this.importer = importer;
	}
	@Override
	public String toString() {
		return "( "+country+" ) "+super.toString();
	}
	
	
}
