package logica.agms;

import java.time.Instant;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import logica.Arista;
import logica.Grafo;

public abstract class AbstractAGM <T extends Comparable<T>>
{
	protected TreeMap<T, TreeSet<Arista<T>>> adjList;
	protected TreeSet<Arista<T>> aristasConExtremoFuera;
	protected TreeSet<Arista<T>> aristasDelAGM;
	protected List<T> verticesConAristasPotenciales;
	protected Grafo<T> g;

	public AbstractAGM(Grafo<T> g) {
		this.g = g;
	}

	public abstract TreeSet<Arista<T>> aristasDelAGM();

	public Grafo<T> AGMdelGrafo() {
		return new Grafo<>(verticesConAristasPotenciales,aristasDelAGM);
	}

	protected void descartarAristasQueGenerarianCiclos() {
		Set<Arista<T>> aristasParaDescartar = new HashSet<>();
		for (Arista<T> arista: aristasConExtremoFuera) {
			if (verticesConAristasPotenciales.contains(arista.obtenerVerticeInicio())
			&& verticesConAristasPotenciales.contains(arista.obtenerVerticeDestino())) {
				aristasParaDescartar.add(arista);
			}
		}
		aristasConExtremoFuera.removeAll(aristasParaDescartar);
	}
	
	public long tiempoEjecucionEnNanoSegundos() {
		long tiempoInicial = System.nanoTime();// devuelve el tiempo en milisegundos
		this.aristasDelAGM();
		long tiempoFinal = System.nanoTime();
		return tiempoFinal - tiempoInicial;
	}
}
