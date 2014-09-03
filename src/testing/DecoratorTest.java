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
		 * La creazione dell'utente non passa pi� dal Decorator, ma avviene tramite il Proxy(vedi sotto)
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
		
		ProxyUser utente1 = new ProxyUser(nome, pwd, ruolo); //Creato nuovo utente
		
		System.out.println("Richiedo le informazioni sull'utente... \n");
		
		String nomeUtente = utente1.getGenericUser().getNomeUtente(); 
		String password = utente1.getGenericUser().getPwd(); 
		String role = utente1.getGenericUser().getRuolo(); 
		
		System.out.println("Ciao a tutti, sono l'utente: " + nomeUtente +"\nla mia password �: "+password+"\ne il mio ruolo � "+role);
		
		System.out.println("Utilizzo il decorator per aggiungere la funzionalit� di Creator ad Alessandro");
		
		//TO-DO...
	}

}
