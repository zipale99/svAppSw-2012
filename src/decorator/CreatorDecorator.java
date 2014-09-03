/**
 * Questa classe estende da DecoratorUser e rappresenta la funzionalità Creator con cui decorare gli oggetti di tipo User.
 */
package decorator;

/**
 * @author utente
 *
 */
public class CreatorDecorator extends DecoratorUser {
	
	public CreatorDecorator(AbstractUser component) { //Decoro con la funzionalità di creator
		super(component);
	}
	
	public String getRuolo() {
		//super.getRuolo(); per conoscere il ruolo di prima
		return "Creator";
	}
}
