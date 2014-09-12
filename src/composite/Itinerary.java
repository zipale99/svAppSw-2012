/**
 * 
 */
package composite;

/**
 * @author utente
 *
 */
public class Itinerary extends StayTemplateComposite {

	int id;
	String stato;
	String type;
	String startLoc;
	String endLoc;
	String durata;
	String categoria;
	String nome;
	String desc;
	
	
	public Itinerary(int id, String stato, String type, String startLoc, String endLoc, String durata, String categoria, String nome, String desc) {
		super();
		this.id = id;
		this.stato = stato;
		this.type = type;
		this.startLoc = startLoc;
		this.endLoc = endLoc;
		this.durata = durata;
		this.categoria = categoria;
		this.nome = nome;
		this.desc = desc;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getStato() {
		return stato;
	}


	public void setStato(String stato) {
		this.stato = stato;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getStartLoc() {
		return startLoc;
	}


	public void setStartLoc(String startLoc) {
		this.startLoc = startLoc;
	}


	public String getEndLoc() {
		return endLoc;
	}


	public void setEndLoc(String endLoc) {
		this.endLoc = endLoc;
	}


	public String getDurata() {
		return durata;
	}


	public void setDurata(String durata) {
		this.durata = durata;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getDesc() {
		return desc;
	}


	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	@Override
	public String toString() {
		return "Stato: " + stato +
				"; Tipologia: " + type +
				"; startLoc: " + startLoc +
				"; endLoc: " + endLoc +
				"; durata: " + durata +
				"; nome: " + nome +
				"; desc: " + desc +
				super.toString();
	}
	
	
	
}

