package version4;

public class Guitar {

	private String serialNumber;
	private double price;
	private GuitarSpec specs;

	public Guitar(String serialNumber, double price, GuitarSpec specs) {
		super();
		this.serialNumber = serialNumber;
		this.price = price;
		this.specs = specs;
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
