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
	
	public boolean matches(InstrumentSpec searchMandolin) {
		boolean res = true;

		if (!super.matches(searchMandolin)) {
			res = false;
		} else {
			Style style = searchMandolin.getStyle();

			if (style != null && style != getStyle()) {
				res = false;
			}
		}

		return res;
	}
	
}
