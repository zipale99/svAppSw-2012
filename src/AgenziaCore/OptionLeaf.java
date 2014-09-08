package AgenziaCore;

import java.util.ArrayList;
import java.util.List;

public class OptionLeaf {
	private int idOptionLeaf;
	private int idLeaf;
	private int idOption;
    
    private List<String> possibleValue=null;//lista di possibili opzioni aggiunte nell'arrayList

    public OptionLeaf() {
    }

    public int getIdOption() {
        return idOption;
    }

    public void setIdOption(int idOption) {
        this.idOption = idOption;
    }

    public OptionLeaf(int idOptionLeaf, int idLeaf, int idOption) {
        this.setIdOptionLeaf(idOptionLeaf);
        this.setIdLeaf(idLeaf);
    	this.idOption = idOption;
        
        possibleValue = new ArrayList();
    }
    
    public void add(String v){
        possibleValue.add(v);
    }

    public List<String> getPossibleValue(){
        return possibleValue;
    }

	public int getIdOptionLeaf() {
		return idOptionLeaf;
	}

	public void setIdOptionLeaf(int idOptionLeaf) {
		this.idOptionLeaf = idOptionLeaf;
	}

	public int getIdLeaf() {
		return idLeaf;
	}

	public void setIdLeaf(int idLeaf) {
		this.idLeaf = idLeaf;
	}
    
}
