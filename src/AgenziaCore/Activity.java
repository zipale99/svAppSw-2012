package AgenziaCore;

public class Activity {	
	int idActivity;
	String tipo;
	String citta;
    String desc;
    String obbligatoria;
    int durata;
    

    public Activity(String tipo, String citta, String desc, int durata,int idActivity,String obbligatoria) {
        this.idActivity = idActivity;
        this.tipo = tipo;
        this.citta = citta;
        this.desc = desc;
        this.durata = durata;
        this.obbligatoria = obbligatoria;
    }

    public String getObbligatoria() {
        return obbligatoria;
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

    public String getTipo() {
        return tipo;
    }

   
    @Override
    public String toString(){
        return tipo+"-"+citta+"-"+desc+"-"+durata;
    }
    
    public String toStringHTML(){
        return"<td> "+tipo+" </td><td> "+citta+" </td><td> "+desc+" </td><td> "+durata+" </td>";
    }
    /** * Restituisce se due Activity sono uguali
    * @param o l'activity con cui si confrontera l'activity this
    * @return true se le due activity sono uguali; false altrimenti
    */
    /*@Override
    public boolean equals(Object o){
       if(!(o instanceof Activity))
		return false;
        if ( o == null ) 
        	return false;
        if(this.tipo.equals(((Activity)o).getTipo()) && this.citta.equals(((Activity)o).getCitta()) && this.desc.equals(((Activity)o).getDesc()) && this.obbligatoria.equals(((Activity)o).getObbligatoria()) && this.durata==((Activity)o).getDurata() && this.offset==((Activity)o).getOffset() && this.idActivity==((Activity)o).getIdActivity()  )
            return true;
        return false;
    }*/
    
    
}
