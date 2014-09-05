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
		
		/*
		 * Utilizzo il proxy per creare un utente e svolgere alcune semplici operazioni su di lui:
		 * ne memorizzo il nome utente, la pwd, il ruolo e richiamo l'operazione di login.
		 */
		
		System.out.println("Creazione Proxy per un utente...");
		ProxyUser utenteProxy = new ProxyUser(); //Creato nuovo ProxyUtente
		
		utenteProxy.setUsername(nome);
		utenteProxy.setPwd(pwd);
		utenteProxy.setRuolo(ruolo);
		
		System.out.println("Restituisco le informazioni sull'utente... \n");
		
		String nomeUtente = utenteProxy.getUsername(); 
		String password = utenteProxy.getPwd(); 
		String role = utenteProxy.getRuolo(); 
		
		System.out.println("Ciao a tutti, sono l'utente: " + nomeUtente +"\nla mia password è: "+password+"\nil mio ruolo è "+role);
		
		System.out.println("Effettuo il login");
		
		utenteProxy.login();
		
		//System.out.println("Utilizzo il decorator per aggiungere la funzionalità di Creator ad Alessandro");
		
		//TO-DO...
		
		/*
		 * Una volta effettuato il login utilizzo un oggetto di tipo AbstractUserComponent che rappresenta un utente generico 
		 * per salvare le inforazioni precedentemente archiviate nel Proxy
		 */
		
		//AbstractUserComponent utenteReale = new ProxyUser();
		//AbstractUserComponent utenteReale = new User();
		AbstractUserComponent utenteReale = utenteProxy;
		
		System.out.println("Adesso sono un utente Reale!\n");
		System.out.println("Restituisco le informazioni sull'utente... \n");
		
		nomeUtente = utenteReale.getUsername(); 
		password = utenteReale.getPwd(); 
		role = utenteReale.getRuolo();
		
		System.out.println("il mio nome è: " + nomeUtente +"\nla mia password è: "+password+"\nil mio ruolo è "+role);
		
		System.out.println("\nDecoro l'utente Reale con la funzionalità di creator");
		
		utenteReale = new CreatorDecorator(utenteReale);
		
		//Recupero nuovamente il ruolo dell'utente
		role = utenteReale.getRuolo();
		System.out.println("\nQual'è il tuo ruolo adesso?");
		System.out.println("\nil mio ruolo è "+role);
	}

}
