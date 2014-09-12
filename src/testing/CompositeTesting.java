package testing;
import composite.*;

public class CompositeTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		StayTemplate st = new Transport("pulmann", "torino", "roma", "6 ore", "to-ro");
		StayTemplate st1 = new Transport("pulmann", "torino", "milano", "4 ore", "to-mi");
		StayTemplate st2 = new Transport("pulmann", "torino", "udine", "2 ore", "to-ud");
		
		StayTemplate st3 = new Accomodation("Hotel","Bello","5 stelle", "torino", "torino", "2 ore", "to-ud-Acc");
		
		StayTemplate ST = new StayTemplateComposite("torino", "udine", "12", "to-ud");
		StayTemplate STAccomodation = new StayTemplateComposite("torino", "udine", "12", "to-ud");
		
		ST.add(st);
		ST.add(st1);
		ST.add(st2);
		
		STAccomodation.add(st3);
		
		//Itinerary it = new Itinerary(1,"parziale","turistico","torino","milano","12","ciao","null","");
		
		StayTemplate it = new Itinerary(1,"parziale","turistico","torino","milano","12","ciao","null","");
		
		/*
		 * L'utente in seguito ad aver manifestato l'intenzione di aggiungere il template di tappa al proprio itinerario
		 * gli verrà richiesto di configurare la tappa con attività e opzioni.
		 * 
		 * Una volta salvato il Template di tappa, questo verrà convertito in un oggetto di tipo Stay e aggiunto all'itinerario.
		 */
		
		Stay tappaSalvata = new Stay(st);
		it.add(tappaSalvata);
		
		
		it.add(ST);
		
		/*
		 * Il database non permette questo assegnamento, come risolviamo???
		 */
		it.add(st3);
		
		
		
		System.out.println("La tappa composta è costituita dai seguenti elementi:\n"+it.toString());
		
		
		
	}

}
