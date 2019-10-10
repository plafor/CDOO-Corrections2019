package version4;

public class GuitarSpec {

	public static final int NO_PREF_NUM_STRINGS = -1;

	private Builder builder;
	private String model;
	private Type type;
	private int numStrings;
	private Wood backWood;
	private Wood topWood;

	public GuitarSpec(Builder builder, String model, Type type, int numStrings, Wood backWood, Wood topWood) {
		super();
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.numStrings = numStrings;
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

	public int getNumStrings() {
		return numStrings;
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
	public boolean matches(GuitarSpec searchGuitar) {
		boolean res = true;

		Builder builder = searchGuitar.getBuilder();
		String model = searchGuitar.getModel();
		Wood topWood = searchGuitar.getTopWood();
		Wood backWood = searchGuitar.getBackWood();
		Type type = searchGuitar.getType();
		int numStrings = searchGuitar.getNumStrings();

		if (
			(builder != null && !builder.equals(getBuilder()))
			|| (model != null && !model.equals("") 
				&& !model.equalsIgnoreCase(getModel()))
			|| (topWood != null && !topWood.equals(getTopWood()))
			|| (backWood != null && !backWood.equals(getBackWood()))
			|| (type != null && !type.equals(getType()))
			|| (numStrings != GuitarSpec.NO_PREF_NUM_STRINGS 
					&& numStrings != getNumStrings())) {
			res = false;
		}

		return res;
	}

}
