package logica;

public class Coordenada {
	private final double latitud;
	private final double longitud;
	
	public Coordenada(double latitud, double longitud) {
		this.latitud = latitud;
		this.longitud = longitud;
	}
	
	public double obtenerLatitud() {
		return this.latitud;
	}
	
	public double obtenerLongitud() {
		return this.longitud;
	}
	
	@Override
	public String toString() {
		StringBuilder infoCoordenada = new StringBuilder();
		infoCoordenada.append("Coodenadas: (")
		.append(this.obtenerLatitud())
		.append(" , ")
		.append(this.obtenerLongitud())
		.append(")");
		return infoCoordenada.toString();
	}
}
