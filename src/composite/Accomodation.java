package composite;

import java.util.ArrayList;

public class Accomodation extends StayTemplateLeaf{

    private String type;
    private String description;
    private String category;
	private int durata;

	public Accomodation(String nome, String type,String description,String category,String startLoc, String endLoc,int durata){
	    super(nome,startLoc,endLoc);
	    this.type=type;
	    this.description=description;
        this.category=category;
	}
	    
	@Override
	public String toString(){
	    return "Accomodation";
	    }
	@Override
	public String toStringHTMLComposite(){
	    return "<td>Accomodation</td><td>"+type+"</td><td>"+description+"</td><td>"+category+"</td><td>"+getStartLoc()+"</td><td></td><td></td><td>"+activity.toString()+"</td><td>"+getDurata()+"</td>";
	}
	    /**
	     * Ritorna la durata
	     * @return durata 
	     */
	@Override
	public int getDurata(){
	    return durata;
	}
	    
	@Override
	public String getInformazioni(){
	    return "Accomodation : "+this.getStartLoc();
	}

	/*@Override
	public String toStringHTMLConfiguration(){
	    String ris= this.getInformazioni()+"<br/>";
	    if(option!=null){
	        for(int i=0;i<option.size();i++){
	            ris+=option.get(i).getName()+"<br/>";
	            for(int c=0;c<option.get(i).getPossibleValue().size();c++){
	                ris+="<input type=\"radio\" name=\""+i+"\" value=\""+option.get(i).getPossibleValue().get(c) +"\">"+option.get(i).getPossibleValue().get(c)+ "<br>";
	            }
	        }
	    }    
	    return ris;
	        
	}*/
	    /*
	     * Aggiunge l'accomodation alla lista list.
	     */
	@Override
	    public void toList(ArrayList list){
	        list.add(this);
	}
	    
	public String getLocality(){
	    return "'"+getStartLoc()+"', ";
	}

	
	
}//////	 fine classe Accomodation
