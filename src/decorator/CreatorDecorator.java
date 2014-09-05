/**
 * Questa classe estende da DecoratorUser e rappresenta la funzionalit� Creator con cui decorare gli oggetti di tipo User.
 */
package decorator;

/**
 * @author utente
 *
 */
public class CreatorDecorator extends DecoratorUser {
	
	public CreatorDecorator(AbstractUserComponent component) { //Decoro con la funzionalit� di creator
		super(component);
	}
	
	public String getRuolo() {
		//super.getRuolo(); per conoscere il ruolo di prima
		return "Creator" + super.getRuolo();
	}
}
