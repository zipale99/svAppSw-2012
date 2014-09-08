package composite;

import composite.StayTemplateLeaf;

public class HandMadeStay extends StayTemplateLeaf {
	
	public HandMadeStay(String nome,String startLoc,String endLoc){
        super(nome,startLoc,endLoc);
	}
	/*public String toString(){
    	return this.getStartLoc()+"-"+this.getEndLoc();
	}*/
	
	public String toString(){
		return "HMS";
	}

	public String toStringHTMLComposite(){
		return "<td>HMS</td><td></td><td></td><td></td><td>"+getStartLoc()+"</td><td>"+getEndLoc();
	}
	


}
