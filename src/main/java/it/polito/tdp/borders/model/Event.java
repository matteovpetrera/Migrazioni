package it.polito.tdp.borders.model;

public class Event implements Comparable<Event>{
	
	private int time;	//passi di simulazione
	// tipo di evento Ingresso (sottinteso)
	private Country destinazione;
	private int dimensione;
	
	public Event(int time, Country destinazione, int dimensione) {
		super();
		this.time = time;
		this.destinazione = destinazione;
		this.dimensione = dimensione;
	}
	/**
	 * @return the time
	 */
	public int getTime() {
		return time;
	}
	/**
	 * @return the destinazione
	 */
	public Country getDestinazione() {
		return destinazione;
	}
	/**
	 * @return the dimensione
	 */
	public int getDimensione() {
		return dimensione;
	}
	@Override
	
	public String toString() {
		return "Event [time=" + time + ", destinazione=" + destinazione + ", dimensione=" + dimensione + "]";
	}
	@Override
	public int compareTo(Event o) {
		// TODO Auto-generated method stub
		return this.time-o.getTime();
	} 
	
	
	
}
