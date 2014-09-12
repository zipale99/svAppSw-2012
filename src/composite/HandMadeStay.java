/**
 * Rappresenta la tipologia Hand Made Stay di uno StayTemplateLeaf
 */
package composite;

/**
 * @author utente
 *
 */
public class HandMadeStay extends StayTemplateLeaf {
	
	public HandMadeStay(String startLoc, String endLoc, String nome) {
		super(startLoc, endLoc, null, nome, "HMS");
	}
	
}
