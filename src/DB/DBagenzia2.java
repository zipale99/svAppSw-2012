package DB;

import java.sql.*;
//import java.util.*;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import java.util.logging.Level;
//import java.util.logging.Logger;

public class DBagenzia2 {
		
	public static void main(String[] args) {
	       
		Connection conn = DBconnection.getConnection();
		
	    try {
	    	


        	//CREA TABELLA UTENTI
       String create = "CREATE TABLE utenti("+
        				"username VARCHAR(30),"+
        				"password VARCHAR(30),"+
        				"tipo VARCHAR(30),"+  
        				"PRIMARY KEY (username))";
        	
        PreparedStatement pst = conn.prepareStatement(create);
        pst.executeUpdate();//fine creazione*/
	    	
	    	
	    	
	    	
	    	         
            //CREA TABELLA ITINERARIO
	        create = "CREATE TABLE itinerario("+
					"idItinerario INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"+
					"creatorUser VARCHAR(30) NOT NULL,"+
					"startLoc VARCHAR(30),"+  
					"endLoc VARCHAR(30),"+
					"durata int not null,"+
					"itName VARCHAR(30),"+
					"itDesc VARCHAR(30),"+
					"itCategory VARCHAR(20),"+
					"stato VARCHAR(30),"+
					"prezzo float(10) not null,"+
					"PRIMARY KEY (idItinerario),"+
					"FOREIGN KEY (creatorUser) REFERENCES UTENTI (username))";
	        	
	        pst = conn.prepareStatement(create);
            pst.executeUpdate();//fine creazione*/
	    	



       
            //CREA TABELLA STAYTEMPLATE
	    	create = "CREATE TABLE STAYTEMPLATE("+
	    			"idStayTempl INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"+
	    			"idItinerario INTEGER,"+
	    			"nomeST varchar (30),"+
	    			"startLoc varchar (30),"+
	    			"endLoc varchar (30),"+
	    			"prezzo float(10) not null,"+
	    			"PRIMARY KEY (idStayTempl),"+
	    			"FOREIGN KEY (idItinerario) REFERENCES ITINERARIO (idItinerario))";
	        	
	        	    pst = conn.prepareStatement(create);
	                pst.executeUpdate();//fine creazione*/
	                
	        
	                
	                	                
	        	
	              //CREA TABELLA ATTIVITA_ST
	    	   create = "CREATE TABLE ATTIVITA_ST("+
	    	    		 	"idAttivitaST INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"+
	    	    		 	"idStayTempl INTEGER NOT NULL,"+
	    	    		 	"durata integer,"+
	    	    		 	"idActivity integer,"+
	    	    		 	"obbligatoria varchar (10),"+

    						"PRIMARY KEY (idAttivitaST),"+
    						"FOREIGN KEY (idStayTempl) REFERENCES STAYTEMPLATE (idStayTempl))";

        	
	    	        pst = conn.prepareStatement(create);
	    	        pst.executeUpdate();//fine creazione*/
	                
	    	        
	    	        
		        	
		        	
		              //CREA TABELLA leaf
		    	create = "CREATE TABLE LEAF("+
		    	 		 "idLeaf INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"+
		    	 		 "idStayTemplate integer,"+
		    	        "typeLeaf varchar(30),"+
		    	   	    "durata VARCHAR(30),"+
		    		    "veicolo varchar(30),"+
		     		    "startLoc varchar(30),"+
		     		    "endLoc varchar(30),"+
		    	    		        
		     		    "PRIMARY KEY (idLeaf),"+
		    	    	"FOREIGN KEY (idStayTemplate) REFERENCES STAYTEMPLATE (idStayTempl))";
    	
		    	     pst = conn.prepareStatement(create);
		    	     pst.executeUpdate();//fine creazione*/
	    	    
	    	        
	                
	
       	
       	
             //CREA TABELLA attivita
		    	 create = "CREATE TABLE ATTIVITA("+
		    	    		 "idAttivita INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"+
		    	    		 "tipo varchar(30),"+
		    	    		 "citta varchar(30),"+
		    	    		 "descrizione varchar(30),"+
		    	    		 "durata varchar(30),"+
		    	    		 "PRIMARY KEY (idAttivita))";

		    	     pst = conn.prepareStatement(create);
		    	     pst.executeUpdate();//fine creazione*/
	    	
	    	
	    	
	    	
	        	
			              //CREA TABELLA attivita_leaf
		  	    create = "CREATE TABLE ATTIVITA_LEAF("+
		 	    		 "idActivityLeaf INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"+
		  	    		 "idLeaf integer not null,"+
		  	    		 "idActivity INTEGER,"+

		  	    		 "PRIMARY KEY (idActivityLeaf),"+
    					"FOREIGN KEY (idLeaf) REFERENCES LEAF (idLeaf),"+
    					"FOREIGN KEY (idActivity) REFERENCES ATTIVITA (idAttivita))";
	    	
			    	    pst = conn.prepareStatement(create);
			    	    pst.executeUpdate();//fine creazione*/
		    	
		    	 
	        	     
					        	
					        	
					              //CREA TABELLA option
				create = "CREATE TABLE opt ("+
			      		 "idOption INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"+
			      		 "nome varchar(30),"+
			      		 "descrizione varchar (30),"+

   						"PRIMARY KEY (idOption))";
			    	
			            pst = conn.prepareStatement(create);
				        pst.executeUpdate();//fine creazione*/
				    	       
				    	        
				    	        
				    	        
				        	
						              //CREA TABELLA option_leaf
				create = "CREATE TABLE option_leaf("+
				   		 "idOptLeaf INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"+
				  		 "idLeaf integer,"+
				  		 "idOption integer,"+
	
    					"PRIMARY key (idOptLeaf),"+
    					"FOREIGN KEY (idOption) REFERENCES opt (idOption),"+
    					"FOREIGN KEY (idLeaf) REFERENCES LEAF (idLeaf))";
				    	
					   	pst = conn.prepareStatement(create);
					   	pst.executeUpdate();//fine creazione*/
					           
					    	        
						    	        
						    	  
						    	        
						        	
				          //CREA TABELLA viaggio
				create = "CREATE TABLE viaggio("+
				   		 "idViaggio INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"+
				   		 "creatorUser VARCHAR(30)  NOT NULL,"+	
				   		 "idItinerario INTEGER NOT NULL,"+
				   		 "startDate VARCHAR(30) NOT NULL,"+
				   		 "endDate VARCHAR(30) NOT NULL,"+
				   		 "costo float(10) not null,"+
				   		 "nPersone integer not null,"+
				   		 "acquistato varchar(20) not null,"+
				   		
				   		 "PRIMARY KEY (idViaggio),"+
    					 "FOREIGN KEY (creatorUser) REFERENCES UTENTI (username),"+
    			  		 "FOREIGN KEY (idItinerario) REFERENCES ITINERARIO (idItinerario))";
					    	
					    pst = conn.prepareStatement(create);
					    pst.executeUpdate();//fine creazione*/
		
	    conn.close();
	            
	  }
	  catch (SQLException ex) {
	  	ex.printStackTrace();
	  }
		    
	}

}