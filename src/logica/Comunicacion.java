package logica;
/*
 * Clase de lógica por ahora prototipo
 * 
 * */
public class Comunicacion {
	private Espia primerEspia;
	private Espia segundoEspia;
	private int probabilidadDeIntercepcion; // Representa el peso de las aristas
	
	public Comunicacion(Espia primerEspia, Espia segundoEspia, int probabilidadDeIntercepcion) {
		this.primerEspia = primerEspia;
		this.segundoEspia = segundoEspia;
		pesoInvalido(probabilidadDeIntercepcion);
		this.probabilidadDeIntercepcion = probabilidadDeIntercepcion;
	}
	
	public Espia obtenerPrimerEspia() {
		return this.primerEspia;
	}
	
	public Espia obtenerSegundoEspia() {
		return this.segundoEspia;
	}
	
	public int obtenerProbabilidadDeIntercepcion() {
		return this.probabilidadDeIntercepcion;
	}
	
	private void pesoInvalido(int pesoArista) {
		if(pesoArista < 1)
			throw new IllegalArgumentException("El peso de la arista de ser mayor o igual a 1");
	}
	
	@Override
	public String toString() {
		StringBuilder infoEspias = new StringBuilder();
		infoEspias.append("Información de Comunicación (")
		.append("Espía 1: (")
		.append(this.obtenerPrimerEspia())
		.append(")")
		.append(" Espía 2: (")
		.append(this.obtenerSegundoEspia())
		.append(")")
		.append(" Probabilidad de exito en la comunicación: ")
		.append(this.obtenerProbabilidadDeIntercepcion())
		.append(")");
		return infoEspias.toString();
	}
}
