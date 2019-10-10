package version5;

public abstract class InstrumentSpec {

	private Builder builder;
	private String model;
	private Type type;
	private Wood backWood;
	private Wood topWood;

	public InstrumentSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood) {
		super();
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
	}

	public Builder getBuilder() {
		return builder;
	}

	public String getModel() {
		return model;
	}

	public Type getType() {
		return type;
	}

	public Wood getBackWood() {
		return backWood;
	}

	public Wood getTopWood() {
		return topWood;
	}

	/*
	 * preconditions : searchGuitar : ce que veut le client et l'objet courant est
	 * une vrai guitare spec
	 * 
	 */
	public boolean matches(InstrumentSpec searchGuitar) {
		boolean res = true;

		Builder builder = searchGuitar.getBuilder();
		String model = searchGuitar.getModel();
		Wood topWood = searchGuitar.getTopWood();
		Wood backWood = searchGuitar.getBackWood();
		Type type = searchGuitar.getType();

		if (
			(builder != null && !builder.equals(getBuilder()))
			|| (model != null && !model.equals("") 
				&& !model.equalsIgnoreCase(getModel()))
			|| (topWood != null && !topWood.equals(getTopWood()))
			|| (backWood != null && !backWood.equals(getBackWood()))
			|| (type != null && !type.equals(getType()))) {
			res = false;
		}

		return res;
	}

}
