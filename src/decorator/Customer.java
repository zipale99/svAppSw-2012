package decorator;

public class Customer extends GenericUser {
	
	public Customer(String nomeUtente, String pwd, String ruolo) {
		super(nomeUtente, pwd, ruolo);
		// TODO Auto-generated constructor stub
	}

	public String getRuolo() {
		return "Customer";
	}
	
}
