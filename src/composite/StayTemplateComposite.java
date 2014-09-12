/**
 * Questa classe rappresenta il Composite, ossia l'aggregazione di oggetti di tipo StayTemplate.
 * Può contenere oggetti di tipo StayTemplateLeaf oppure altri oggetti composti di tipo StayTemplateComposite.
 */
package composite;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;



/**
 * @author utente
 *
 */
public class StayTemplateComposite extends StayTemplate {
	
	List<StayTemplate> tree;
	
	
	public StayTemplateComposite(String startLoc, String endLoc, String durata, String nome) {
		super(startLoc, endLoc, durata, nome);
		tree = new ArrayList<StayTemplate>();
	}

	public StayTemplateComposite() {
		tree = new ArrayList<StayTemplate>();
	}
	
	public void add (StayTemplate st) {
		tree.add(st);
	}
	
	public void remove (StayTemplate st) {
		tree.remove(st);
	}
	
	@Override
	public String toString() { 
		String result = "";
		Iterator<StayTemplate> it = tree.iterator();
		while(it.hasNext()) {
			result = result + it.next().toString();
		}
		return result;
	}
	
	
	
	
	
	
}
