package logica;

public class Espia {
	private String nombre;
	private Coordenada coordenada;
	
	
	public Espia(String nombre, Coordenada coordenada) {
		this.nombre = nombre;
		this.coordenada = coordenada;
	}
	
	public String obtenerNombreEspia() {
		return this.nombre;
	}
	
	public Coordenada obtenerCoordenadaEspia() {
		return this.coordenada;
	}
	
	@Override
	public String toString() {
		StringBuilder infoEspia = new StringBuilder();
		infoEspia.append("Nombre: ")
		.append(this.obtenerNombreEspia())
		.append(" ")
		.append(this.obtenerCoordenadaEspia().toString());
		return infoEspia.toString();
	}
}
