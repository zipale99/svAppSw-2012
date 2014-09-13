package testing;
import composite.*;

public class CompositeTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		StayTemplate leaf1 = new Transport("pulmann", "torino", "roma", "6 ore", "to-ro");
		StayTemplate leaf2 = new Transport("pulmann", "torino", "milano", "4 ore", "to-mi");
		StayTemplate leaf3 = new Transport("pulmann", "torino", "udine", "2 ore", "to-ud");
		StayTemplate leaf4 = new Accomodation("Hotel","Bello","5 stelle", "torino", "torino", "2 ore", "to-ud-Acc");
		
		StayTemplate tappaComposita1 = new StayTemplateComposite("torino", "udine", "12", "to-ud");
		StayTemplate tappaComposita2 = new StayTemplateComposite("torino", "udine", "12", "to-ud");
	
		//Creazione tappa composita 1
		tappaComposita1.add(leaf1);
		tappaComposita1.add(leaf2);
		tappaComposita1.add(leaf3);
		
		//Creazione tappa composita 2
		tappaComposita2.add(leaf3);
		tappaComposita2.add(leaf4);
		
		
		//Creo un nuovo itinerario
		Itinerary itinerario = new Itinerary(1,"parziale","turistico","torino","milano","12","ciao","null","");
		
		itinerario.add(tappaComposita1);
		itinerario.add(leaf2);
		itinerario.add(tappaComposita2);
		itinerario.add(leaf4);
		
		
		
		
		
		//System.out.println("La tappa composta è costituita dai seguenti elementi:\n"+it.toString());
		
		
		
	}

}
