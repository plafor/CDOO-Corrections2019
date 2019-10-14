package version5;

public class GuitarSpec extends InstrumentSpec {

	public static final int NO_PREF_NUM_STRINGS = -1;

	private int numStrings;

	public GuitarSpec(Builder builder, String model, int numStrings, Type type, Wood backWood, Wood topWood) {
		super(builder, model, type, backWood, topWood);
		this.numStrings = numStrings;
	}

	public int getNumStrings() {
		return numStrings;
	}

	/*
	 * preconditions : searchGuitar : ce que veut le client et l'objet courant est
	 * une vrai guitare spec
	 * 
	 */
	@Override
	public boolean matches(InstrumentSpec searchInstrument) {
		boolean res = true;
		
		if (searchInstrument instanceof MandolinSpec) {
			res = false;
		} else if (!super.matches(searchInstrument)) {
			res = false;
		} else {
			int numStrings = ((GuitarSpec) searchInstrument).getNumStrings();

			if (numStrings != GuitarSpec.NO_PREF_NUM_STRINGS && numStrings != getNumStrings()) {
				res = false;
			}
		}

		return res;
	}

}
