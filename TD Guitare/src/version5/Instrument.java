package version5;

public abstract class Instrument {

	private String serialNumber;
	private double price;
	private InstrumentSpec specs;

	public Instrument(String serialNumber, double price, InstrumentSpec specs) {
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

	public InstrumentSpec getSpecs() {
		return specs;
	}
}
