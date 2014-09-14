/**
 * Rappresenta la tipologia Transport di uno StayTemplateLeaf
 */
package composite;

import java.util.List;

import resources.Option;

/**
 * @author utente
 *
 */
public class Transport extends StayTemplateLeaf {
	
	private String vehicle;
	
	public Transport(String vehicle, String startLoc, String endLoc, String durata, String nome, List<Option> optionValueList) {
		super(startLoc, endLoc, durata, nome, "Transport", optionValueList);
		this.vehicle = vehicle;
	}

	public String getVehicle() {
		return vehicle;
	}

	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() +
				"\nVeicolo: " + vehicle;
	}
	
	
}
