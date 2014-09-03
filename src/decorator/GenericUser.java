/**
 * Oggetto ConcreteComponent, implementa l'interfaccia di User e rappresenta la generalizzazione per i diversi tipi di utenti
 * Customer e TA.
 * 
 * TO-DO: Gerarchia degli utenti Customer e TA a partire da questa classe.
 *  
 */
package decorator;

/**
 * @author Alessandro
 *
 */
public abstract class GenericUser extends User{

	public GenericUser (String nomeUtente, String pwd, String ruolo) {
		super(nomeUtente, pwd, ruolo);
	}
	
	public String getRuolo() {
		return this.ruolo;
	}
	
	
}
