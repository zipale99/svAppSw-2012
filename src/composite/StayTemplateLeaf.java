/**
 * Questa classe rappresenta un singolo componente Leaf generico che a sua volta può essere un Transpor, un Accomodation o un HMS (che la estendono).
 */
package composite;

/**
 * @author utente
 *
 */
public class StayTemplateLeaf extends StayTemplate {
	
	String typeLeaf;
	
	public StayTemplateLeaf(String startLoc, String endLoc, String durata, String nome, String typeLeaf) {
		super(startLoc, endLoc, durata, nome);
		this.typeLeaf = typeLeaf;
	}
	
	public String getTypeLeaf() {
		return typeLeaf;
	}

	public void add(StayTemplate st){}
	
	@Override
	public String toString() {
		return super.toString() +
				"\nTypeLeaf: " + typeLeaf;
	}
		
}
