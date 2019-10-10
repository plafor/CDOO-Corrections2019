package version3;

public class Guitar {

	private String serialNumber;
	private double price;
	private GuitarSpec specs;
	
	public Guitar(String serialNumber, double price, Builder builder, String model, Type type, Wood backWood,
			Wood topWood) {
		super();
		this.serialNumber = serialNumber;
		this.price = price;
		specs = new GuitarSpec(builder, model, type, backWood, topWood); 
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public double getPrice() {
		return price;
	}

	public GuitarSpec getSpecs() {
		return specs;
	}
	
	
}
