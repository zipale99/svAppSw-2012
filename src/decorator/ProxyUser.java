/**
 * Questa classe rappresenta il proxy vero e proprio, è la classe che media l'accesso diretto a un oggetto di tipo GenericUser
 */
package decorator;

/**
 * @author Alessandro
 *
 */
public class ProxyUser extends AbstractUser {
	
	private User user; //Riferimento a un istanza della classe User
	
	public ProxyUser() {
		user = new User();
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
		if (this.user == null)
			System.out.println("Guarda che il riferimento al real object è NULL !!!!!");
		else this.user.setUsername(username);
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
		System.out.println("Eseguo il metodo Login del ProxyUser");
		/*
		 *** TO-DO ***
		 */
	}
	
	
}
