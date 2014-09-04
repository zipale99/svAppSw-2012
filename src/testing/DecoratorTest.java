/**
 * Semplice test per il package Decorator
 */
package testing;


import decorator.*;
/**
 * @author Alessandro
 *
 */
public class DecoratorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*
		 * La creazione dell'utente non passa più dal Decorator, ma avviene tramite il Proxy(vedi sotto)
		 * 
		 * AbstractUser utente = new User(); //Creato un utente
		 * System.out.println("Chi sei? \n");
		 * utente.getRuolo();
		 * 
		 * utente = new CreatorDecorator(utente);
		 * System.out.println("Chi sei adesso?");
		 * utente.getRuolo();
		 */
		
		String nome = "Alessandro";
		String pwd = "qwerty";
		String ruolo = "Customer";
		
		
		
		ProxyUser utente1 = new ProxyUser(); //Creato nuovo utente
		
		utente1.setUsername(nome);
		utente1.setPwd(pwd);
		utente1.setRuolo(ruolo);
		
		System.out.println("Richiedo le informazioni sull'utente... \n");
		
		String nomeUtente = utente1.getUsername(); 
		String password = utente1.getPwd(); 
		String role = utente1.getRuolo(); 
		
		System.out.println("Ciao a tutti, sono l'utente: " + nomeUtente +"\nla mia password è: "+password+"\ne il mio ruolo è "+role);
		
		System.out.println("Effettuo il login");
		
		utente1.login();
		
		//System.out.println("Utilizzo il decorator per aggiungere la funzionalità di Creator ad Alessandro");
		
		//TO-DO...
	}

}
