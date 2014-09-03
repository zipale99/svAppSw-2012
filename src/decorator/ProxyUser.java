/**
 * Questa classe rappresenta il proxy vero e proprio, è la classe che media l'accesso diretto a un oggetto di tipo GenericUser
 * Si noti che questa classe, crea un istanza della classe GenericUser solo al momento in cui diventa indispensabile,
 * ossia solo quando ne vengono richieste le informazioni complete.
 */
package decorator;

/**
 * @author Alessandro
 *
 */
public class ProxyUser extends User {
	
	protected GenericUser user; //Riferimento a un istanza della classe GenericUser
	
	public ProxyUser(String nomeUtente, String pwd, String ruolo) {
		super(nomeUtente, pwd, ruolo);
		System.out.println( "(creating a proxy cache)" );
		// TODO Auto-generated constructor stub
	}
	
	public GenericUser getGenericUser(){
		if( user == null )
			user = new Customer(nomeUtente, pwd, ruolo);
		return user;
	}
	
}
