package logica;

import org.openstreetmap.gui.jmapviewer.Coordinate;

public class EspiasHarcodeado {
	
	private static final Espia espia1 = new Espia("Buenos Aires", new Coordinate(-36.5, -60.5));
	// En el enunciado se incluye espia2. Para fines prácticos, se la considera Espia
	private static final Espia espia2 = new Espia("Ciudad Autónoma de Buenos Aires", new Coordinate(-34.6037, -58.3816));
	private static final Espia espia3 = new Espia("espia3", new Coordinate(-27.25, -67.25));
	private static final Espia espia4 = new Espia("espia4", new Coordinate(-26.5, -60.75));
	private static final Espia espia5 = new Espia("espia5", new Coordinate(-44, -68.5));
	private static final Espia espia6 = new Espia("Córdoba", new Coordinate(-32, -63.8));
	private static final Espia espia7 = new Espia("espia7", new Coordinate(-28.75, -57.9));
	private static final Espia espia8 = new Espia("Entre Ríos", new Coordinate(-32, -59.35));
	private static final Espia espia9 = new Espia("espia9", new Coordinate(-24.75, -60));
	private static final Espia espia10 = new Espia("espia10", new Coordinate(-23, -66));
	private static final Espia espia11 = new Espia("La Rioja", new Coordinate(-29.4131, -67.25));
	private static final Espia espia12 = new Espia("La Pampa", new Coordinate(-37.25, -65.5));
	private static final Espia espia13 = new Espia("espia13", new Coordinate(-34.5, -68.5));
	private static final Espia espia14 = new Espia("espia14", new Coordinate(-27, -54.75));
	private static final Espia espia15 = new Espia("Neuquén", new Coordinate(-38.5, -70));
	private static final Espia espia16 = new Espia("Río Negro", new Coordinate(-40.25, -67.25));
	private static final Espia espia17 = new Espia("espia17", new Coordinate(-25.25, -64.75));
	private static final Espia espia18 = new Espia("San Juan", new Coordinate(-30.75, -68.8));
	private static final Espia espia19 = new Espia("San Luis", new Coordinate(-33.75, -66.1));
	private static final Espia espia20 = new Espia("Santa Cruz", new Coordinate(-48.6226, -70));
	private static final Espia espia21 = new Espia("Santa Fe", new Coordinate(-30.6107, -61));
	private static final Espia espia22 = new Espia("Santiago del Estero", new Coordinate(-27.7951, -63.5));
	private static final Espia espia23 = new Espia("Tierra del Fuego", new Coordinate(-54.25, -67.7));
	private static final Espia espia24 = new Espia("Tucumán", new Coordinate(-26.9, -65.4));

	private static boolean seAgregaronEspiasCercanos = false;

	public static Espia[] EspiasDeArgentina() {
		if (!seAgregaronEspiasCercanos)
			agregarEspiasCeranos();
		return new Espia[] {
				espia1, espia2, espia3, espia4, espia5, espia6, espia7, espia8,
				espia9, espia10, espia11, espia12, espia13, espia14, espia15, espia16, espia17,
				espia18, espia19, espia20, espia21, espia22, espia23, espia24
		};
	}

	private static void agregarEspiasCeranos() {
		espia1.agregarEspiasCeranos(espia2,espia6,espia8,espia12,espia16,espia21);
		espia2.agregarEspiasCeranos(espia1);
		espia3.agregarEspiasCeranos(espia6,espia11,espia17,espia22,espia24);
		espia4.agregarEspiasCeranos(espia7,espia9,espia17,espia21,espia22);
		espia5.agregarEspiasCeranos(espia16,espia20);
		espia6.agregarEspiasCeranos(espia1,espia3,espia12,espia11,espia19,espia21,espia22);
		espia7.agregarEspiasCeranos(espia4,espia8,espia14, espia21);
		espia8.agregarEspiasCeranos(espia1,espia7,espia21);
		espia9.agregarEspiasCeranos(espia4, espia17);
		espia10.agregarEspiasCeranos(espia17);
		espia11.agregarEspiasCeranos(espia3, espia6,espia18,espia19);
		espia12.agregarEspiasCeranos(espia1,espia6,espia13,espia16,espia19);
		espia13.agregarEspiasCeranos(espia12,espia15,espia18,espia19);
		espia14.agregarEspiasCeranos(espia7);
		espia15.agregarEspiasCeranos(espia13,espia16);
		espia16.agregarEspiasCeranos(espia1,espia5,espia12, espia15);
		espia17.agregarEspiasCeranos(espia3,espia4,espia9,espia10,espia22,espia24);
		espia18.agregarEspiasCeranos(espia11,espia13,espia19);
		espia19.agregarEspiasCeranos(espia6,espia12,espia11,espia13,espia18);
		espia20.agregarEspiasCeranos(espia5, espia23);
		espia21.agregarEspiasCeranos(espia1,espia4,espia6,espia7,espia8,espia22);
		espia22.agregarEspiasCeranos(espia3,espia4,espia6,espia17,espia21,espia24);
		espia23.agregarEspiasCeranos(espia20);
		espia24.agregarEspiasCeranos(espia3,espia17,espia22);
		seAgregaronEspiasCercanos = true;
	}

}
