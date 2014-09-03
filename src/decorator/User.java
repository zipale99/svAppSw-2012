/**
 * Subject: Rappresenta l'interfaccia comune RealSubject(GenericUser) e a Proxy(ProxyUser)
 * Utilizziamo una classe astratta al posto di un interfaccia in quanto deve implementare anche l'intefaccia AbstractUser.
 */
package decorator;

/**
 * @author utente
 *
 */
public abstract class User implements AbstractUser {
	
	public String nomeUtente;
	public String pwd;
	public String ruolo;
	
	public User (String nomeUtente, String pwd, String ruolo) {
		this.setNomeUtente(nomeUtente);
		this.setPwd(pwd);
		this.setRuolo(ruolo);
	}

	public String getNomeUtente() {
		return nomeUtente;
	}

	public void setNomeUtente(String nomeUtente) {
		this.nomeUtente = nomeUtente;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getRuolo() {
		return ruolo;
	}

	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}

}
