/**
 * Questa classe rappresenta il proxy vero e proprio, è la classe che media l'accesso diretto a un oggetto di tipo User.
 * 
 * In sostanza il Proxy viene impiegato solamente allo scopo di fare da surrogato per User al fine di controllarne l'accesso,
 * consente di aggiugnere un ulteriore livello di indirezione. 
 * 
 * Senza l'utilizzo del proxy, il metodo login/sign-up avrebbe dovuto appartenere alla classe User, utilizzando il Proxy invece,
 * i metodi login/sign-up avvengono all'interno di questa classe e in caso di successo, viene restituito l'oggetto reale (User).
 * 
 * TO-DO: Effettuare tutti i controlli necessari sull'istanza User che deve essere sempre divero da NULL.
 */
package decorator;

/**
 * @author Alessandro
 *
 */
public class ProxyUser extends AbstractUser {
	
	private User user; //Riferimento a un istanza della classe User
	
	/*
	 * Costruttore implementato solo per fare delle prove, nel caso reale, l'oggetto User sarà creato
	 * all'interno del metodo login.
	 */
	public ProxyUser() {
		user = new User();
		System.out.println("( ProxyUser creato )");
	}
	
	public ProxyUser(User user) {
		this.user = user;
	}
	
	@Override
	public String getUsername() {
		return user.getUsername();
	}
	
	@Override
	public String getPwd() {
		return user.getPwd();
	}
	
	@Override
	public String getRuolo() {
		return user.getRuolo();
	}
	
	@Override
	public void setUsername(String username) {
		// TODO Auto-generated method stub
		this.user.setUsername(username);
	}
	
	@Override
	public void setPwd(String pwd) {
		// TODO Auto-generated method stub
		this.user.setPwd(pwd);
		
	}
	
	@Override
	public void setRuolo(String ruolo) {
		// TODO Auto-generated method stub
		this.user.setRuolo(ruolo);
	}
	
	public void login() {
		System.out.println("( Metodo Login di ProxyUser )");
		/*
		 *** TO-DO ***
		 *Istanziare il real object solo in caso di autenticazione corretta e restituirlo con i parametri
		 *impostati(parametro user passato come parametro)
		 */
	}

	public User getUser() {
		return user;
	}
	
	
}