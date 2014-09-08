package AgenziaCore;

public class UserNotAuthorizedException extends Exception {
	
	public UserNotAuthorizedException(){
        super("Utente non autorizzato");
    }
	
}
