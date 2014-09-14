/**
 * Questa classe astratta rappresenta il Component, è estesa da StayTemplateLeaf e da StayTemplateComposite
 */
package composite;

/**
 * @author utente
 *
 */
public abstract class StayTemplate {
	
	int id;
	String startLoc;
	String endLoc;
	String durata;
	String nome;
	double price;
	int timeOffset;
	
	/*
	 * Costruttore di default, viene chiamato da StayTemplateComposite quando 
	 * viene creato un composite per la realizzazione di un itinerario
	 */
	public StayTemplate() {
	}
	
	public StayTemplate(String startLoc, String endLoc, String durata, String nome) {
		this.startLoc = startLoc;
		this.endLoc = endLoc;
		this.durata = durata;
		this.nome = nome;
	}
	
	
	public abstract void add(StayTemplate st);
	//public abstract void remove(StayTemplate st);
	
	@Override
	public String toString() {
		return  "\nstartLoc: " + startLoc +
				"\nendLoc: " + endLoc +
				"\ndurata: " + durata +
				"\nnome: " + nome;
	}
	
		
}
