package version5;

public class MandolinSpec extends InstrumentSpec {

	private Style style;

	public MandolinSpec(Builder builder, String model, Style style, Type type, Wood backWood, Wood topWood) {
		super(builder, model, type, backWood, topWood);
		this.style = style;
	}

	public Style getStyle() {
		return style;
	}

	@Override
	public boolean matches(InstrumentSpec searchInstrument) {
		boolean res = true;

		if (searchInstrument instanceof GuitarSpec) {
			res = false;
		} else if (!super.matches(searchInstrument)) {
			res = false;
		} else {

			Style style = ((MandolinSpec) searchInstrument).getStyle();

			if (style != null && style != getStyle()) {
				res = false;
			}
		}

		return res;
	}

}
