/**
 * Rappresenta la tipologia Accomodation di uno StayTemplateLeaf
 */
package composite;

/**
 * @author utente
 *
 */
public class Accomodation extends StayTemplateLeaf {
	
	String type;
	String description;
	String category;
	
	public Accomodation(String type, String description, String category, String startLoc, String endLoc, String durata, String nome) {
		super(startLoc, endLoc, durata, nome, "Accomodation");
		this.type = type;
		this.description = description;
		this.category = category;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() +
				"\nType: " + type +
				"\nDescription: " + description +
				"\nCategory: " + category;
	}
	
	
	
}
