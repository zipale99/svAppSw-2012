package decorator;

public class TA extends GenericUser {

	public TA(String nomeUtente, String pwd, String ruolo) {
		super(nomeUtente, pwd, ruolo);
		// TODO Auto-generated constructor stub
	}
	
	public String getRuolo() {
		return "TA";
	}

}
