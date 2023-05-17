package it.polito.tdp.borders.model;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultEdge;

public class Simulatore {

	// Stato del sistema e output
	private Map<Country, Integer> stanziali;
	
	//parametri della simulazione
	private Graph<Country, DefaultEdge> graph;
	private int nPersone = 1000;
	private Country statoPartenza;
	
	//output
	private int numeroPassi;
	
	//coda degli eventi
	private PriorityQueue<Event> queue;
	
	public Simulatore(Graph<Country, DefaultEdge> graph, Country partenza) {
		
		this.graph = graph;
		this.statoPartenza = partenza;
		
		this.numeroPassi = 0;
		
		this.stanziali = new HashMap<Country, Integer>();
		//aggiungo tutte le country alla mappa con popolazione 0
		for(Country c : this.graph.vertexSet()) {
			this.stanziali.put(c, 0);
		}
		
		this.queue = new PriorityQueue<Event>();
	}
	
	private void initialize() {
		this.queue.add(new Event(0, this.statoPartenza, this.nPersone));
	}
	
	private void run() {
		while(this.queue.isEmpty()) {
			Event c = this.queue.poll();
			Country destinazione = c.getDestinazione();
			int time = c.getTime();
			int dimensione = c.getDimensione();
			
			
			// dimensione / 2 si dividono negli stati adiacenti
			// generando eventi INGRESSO con la quota di persone
			
			//i rimanenti diventano stanziali nello stato destinazione 

		}
	}
}
