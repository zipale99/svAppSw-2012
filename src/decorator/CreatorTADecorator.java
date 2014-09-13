package decorator;

public class CreatorTADecorator extends DecoratorUser {

	public CreatorTADecorator(AbstractUserComponent component) { //Decoro con la funzionalità di creator
		super(component);
	}
	
	public String getRuolo() {
		//super.getRuolo(); per conoscere il ruolo di prima
		return "CreatorTA";
	}
	
	/*
	 * public String getRuolo() {
		//super.getRuolo(); per conoscere il ruolo di prima
		return "Creator" + super.getRuolo();
	}
	 */
}

