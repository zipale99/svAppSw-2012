/**
 * Questa classe rappresenta un singolo componente Leaf generico che a sua volta può essere un Transpor, un Accomodation o un HMS (che la estendono).
 */
package composite;

import java.util.List;

/**
 * @author utente
 *
 */
public class StayTemplateLeaf extends StayTemplate {
	
	String typeLeaf;
	List<Option> optionValueList;
	
	public StayTemplateLeaf(String startLoc, String endLoc, String durata, String nome, String typeLeaf, List<Option> optionValueList) {
		super(startLoc, endLoc, durata, nome);
		this.typeLeaf = typeLeaf;
		this.setOptionValueList(optionValueList);
	}
	
	public String getTypeLeaf() {
		return typeLeaf;
	}

	public void add(StayTemplate st){}
	
	public List<Option> getOptionValueList() {
		return optionValueList;
	}

	public void setOptionValueList(List<Option> optionValueList) {
		this.optionValueList = optionValueList;
	}

	@Override
	public String toString() {
		return super.toString() +
				"\nTypeLeaf: " + typeLeaf;
	}
		
}
