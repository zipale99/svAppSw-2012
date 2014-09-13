/**
 * 
 */
package composite;

/**
 * @author utente
 *
 */
public class Activity {
	
	String type;
    String location;
    String desc;
    boolean obbligatorie;
    int durata;
    int offset;
    int idActivity;

    public Activity(String tipo, String citta, String desc, int durata,int idActivity,String obbligatorie) {
        this.idActivity = idActivity;
        this.tipo = tipo;
        this.citta = citta;
        this.desc = desc;
        this.durata = durata;
        this.obbligatorie = obbligatorie;
    }

    public String getObbligatorie() {
        return obbligatorie;
    }

    public int getIdActivity() {
        return idActivity;
    }

    public void setIdActivity(int idActivity) {
        this.idActivity = idActivity;
    }

    public String getCitta() {
        return citta;
    }

    public String getDesc() {
        return desc;
    }

    public int getDurata() {
        return durata;
    }

    public int getOffset() {
        return offset;
    }

    public String getTipo() {
        return tipo;
    }


}
