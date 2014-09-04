/**
 * Allo stesso modo del ConcretComponent, anche la classe DecoratorUser implementa l'interfaccia AbstracUser, ha il compito di decorare l'oggetto User
 * con i ConcreteDecorator(Creator)
 */
package decorator;

/**
 * @author Alessandro
 *
 */
public abstract class DecoratorUser extends AbstractUserComponent {
	
	protected AbstractUser component; //Riferimento al component

	public DecoratorUser(AbstractUser component) { //Assegno la decorazione al component
		this.component = component; 
	}
	
	public String getRuolo() {
		return component.getRuolo();
	}
	
	public String getUsername() {
		return component.getUsername();
	}
	
	public String getPwd() {
		return component.getPwd();
	}
}
