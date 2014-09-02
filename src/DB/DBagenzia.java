package DB;

import java.sql.*;
//import java.util.*;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import java.util.logging.Level;
//import java.util.logging.Logger;

public class DBagenzia {
		
	public static void main(String[] args) {
	       
		Connection conn = DBconnection.getConnection();
		
	    try {
	    	
	    		///ELIMINA TABELLA UTENTI
	    	/*String drop = "drop table utenti";
            PreparedStatement pst = conn.prepareStatement(drop);
            pst.executeUpdate();//fine cancellazione*/
	         
	        	//CREA TABELLA UTENTI
	       String create = "CREATE TABLE utenti("+
	        				"username VARCHAR(10),"+
	        				"password VARCHAR(10),"+
	        				"tipo VARCHAR(20),"+  
	        				"PRIMARY KEY (username))";
	        	
	        PreparedStatement pst = conn.prepareStatement(create);
            pst.executeUpdate();//fine creazione*/
            
            
            
            
            
            
            //	ELIMINA TABELLA ITINERARIO
            /*drop = "drop table ITINERARIO";
            pst = conn.prepareStatement(drop);
            pst.executeUpdate();//fine cancellazione*/
	         
            //CREA TABELLA ITINERARIO
	        create = "CREATE TABLE itinerario("+
					"idItinerario INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"+
					"creatorUser VARCHAR(10) NOT NULL,"+
					"startLoc VARCHAR(20),"+  
					"endLoc VARCHAR(20),"+
					"durata int not null,"+
					"itName VARCHAR(20),"+
					"itDesc VARCHAR(20),"+
					"itCategory VARCHAR(20),"+
					"stato VARCHAR(20),"+
					"prezzo float(10) not null,"+
					"PRIMARY KEY (idItinerario),"+
					"FOREIGN KEY (creatorUser) REFERENCES UTENTI (username))";
	        	
	        pst = conn.prepareStatement(create);
            pst.executeUpdate();//fine creazione*/
	        
            

            
            //ELIMINA TABELLA STAYTEMPLATE
        	/*drop = "drop table STAYTEMPLATE";
            pst = conn.prepareStatement(drop);
            pst.executeUpdate();//fine cancellazione*/
	    	
            
            //CREA TABELLA STAYTEMPLATE
	    	create = "CREATE TABLE STAYTEMPLATE("+
	    			"idStayTempl INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"+
	    			"idItinerario INTEGER,"+
	    			"nomeST varchar (20),"+
	    			"startLoc varchar (20),"+
	    			"endLoc varchar (20),"+
	    			"prezzo float(10) not null,"+
	    			"PRIMARY KEY (idStayTempl),"+
	    			"FOREIGN KEY (idItinerario) REFERENCES ITINERARIO (idItinerario))";
	        	
	        	    pst = conn.prepareStatement(create);
	                pst.executeUpdate();//fine creazione*/
	                
	        
	                
	                
	                
	                
	                //ELIMINA TABELLA ATTIVITA_ST
	             /*drop = "drop table ATTIVITA_ST";
	             pst = conn.prepareStatement(drop);
	             pst.executeUpdate();//fine cancellazione*/
	        	
	        	
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
	                
	    	        
	    	        
	    	    
	    	        
	    	        //ELIMINA TABELLA leaf
		             /*drop = "drop table leaf";
		             pst = conn.prepareStatement(drop);
		             pst.executeUpdate();//fine cancellazione*/
		        	
		        	
		              //CREA TABELLA leaf
		    	     create = "CREATE TABLE LEAF("+
		    	    		 "idLeaf INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"+
		    	    		    "idStayTemplate integer,"+
		    	    		    "typeLeaf varchar (20),"+
		    	    		    "duarata VARCHAR(20),"+
		    	    		    "veicolo varchar(20),"+
		    	    		    "startLoc varchar (20),"+
		    	    		    "startEnd varchar (20),"+
		    	    		    "description varchar(20),"+
		    	    		    "category varchar(20),"+
		    	    		        

		    	    		    "PRIMARY KEY (idLeaf),"+
		    	    		    "FOREIGN KEY (idStayTemplate) REFERENCES STAYTEMPLATE (idStayTempl))";
    	
		    	     pst = conn.prepareStatement(create);
		    	        pst.executeUpdate();//fine creazione*/
	    	    
	    	        
	                
		    	        
		    	        
	    	
	    	
  	      //ELIMINA TABELLA ATTIVITA
            /*drop = "drop table ATTIVITA";
            pst = conn.prepareStatement(drop);
            pst.executeUpdate();//fine cancellazione*/
       	
       	
             //CREA TABELLA attivita
   	     create = "CREATE TABLE ATTIVITA("+
   	    		 "idAttivita INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"+
   	    		 "tipo varchar (20),"+
   	    		 "citta varchar (20),"+
   	    		 "descrizione varchar (20),"+
   	    		 "durata varchar(20),"+
					"PRIMARY KEY (idAttivita))";

   	        pst = conn.prepareStatement(create);
   	        pst.executeUpdate();//fine creazione*/
	    	
	    	
	    	
	    	
	    	
	    	
		    	 
		    	        
		    	        
		    	      //ELIMINA TABELLA ATTIVITA_LEAF
			             /*drop = "drop table ATTIVITA_LEAF";
			             pst = conn.prepareStatement(drop);
			             pst.executeUpdate();//fine cancellazione*/
			        	
			        	
			              //CREA TABELLA attivita_leaf
			    	    create = "CREATE TABLE ATTIVITA_LEAF("+
			    	    		 "idActivityLeaf INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"+
			    	    		 "idLeaf integer,"+
			    	    		 "range integer,"+
			    	    		 "idActivity INTEGER,"+

    							"PRIMARY KEY (idActivityLeaf),"+
    							"FOREIGN KEY (idLeaf) REFERENCES LEAF (idLeaf),"+
    							"FOREIGN KEY (idActivity) REFERENCES ATTIVITA (idAttivita))";
	    	
			    	        pst = conn.prepareStatement(create);
			    	        pst.executeUpdate();//fine creazione*/
		    	
		    	 
	                
	        
				    	        
				    	        
				    	        //ELIMINA TABELLA option
					             /*drop = "drop table option";
					             pst = conn.prepareStatement(drop);
					             pst.executeUpdate();//fine cancellazione*/
					        	
					        	
					              //CREA TABELLA option
					    	     create = "CREATE TABLE opt ("+
					    	    		 "idOption INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"+
					    	    		 "nome varchar(20),"+
					    	    		 "descrizione varchar (20),"+

   									"PRIMARY KEY (idOption))";
			    	
					    	        pst = conn.prepareStatement(create);
					    	        pst.executeUpdate();//fine creazione*/
				    	        
				    	        
				    	        
				    	        
					    
					    	        
					    	        //ELIMINA TABELLA option_leaf
						             /*drop = "drop table option_leaf";
						             pst = conn.prepareStatement(drop);
						             pst.executeUpdate();//fine cancellazione*/
						        	
						        	
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
					    	        
					    	        
						    	        
						    	  
						    	        
						    	        
						    	        
						    	        
						    	      //ELIMINA TABELLA viaggio
							             /*drop = "drop table viaggio";
							             pst = conn.prepareStatement(drop);
							             pst.executeUpdate();//fine cancellazione*/
							        	
							        	
							              //CREA TABELLA viaggio
							    	    create = "CREATE TABLE viaggio("+
							    	    		 "idViaggio INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"+
							    	    		 "creatorUser VARCHAR(10)  NOT NULL,"+	
							    	    		 "idItinerario INTEGER NOT NULL,"+
							    	    		 "startDate VARCHAR(20) NOT NULL,"+
							    	    		 "endDate VARCHAR(20) NOT NULL,"+
							    	    		 "costo VARCHAR(20) NOT NULL,"+
							    	    		 "nPersone VARCHAR(20) NOT NULL,"+
							    	    		 "acquistato varchar(5) not null,"+

    											  "PRIMARY KEY (idViaggio),"+
    											  "FOREIGN KEY (creatorUser) REFERENCES UTENTI (username),"+
    											  "FOREIGN KEY (idItinerario) REFERENCES ITINERARIO (idItinerario))";
					    	
							    	      pst = conn.prepareStatement(create);
							    	      pst.executeUpdate();//fine creazione*/
						    	        
						    	
					   
				    	        
	        	//per cancellare tabella
	        	/*String drop = "drop table itinerario";
	            PreparedStatement pst = conn.prepareStatement(drop);
	            pst.executeUpdate();//fine cancellazione*/
	        	
	        	
	            //per inserire una tupla       	

	        	/*String insert = "INSERT INTO staytemplate (idItinerario, nomeST, startLoc, endLoc, prezzo)VALUES (?,?,?,?,?)";
	        	PreparedStatement pst = conn.prepareStatement(insert);            
	            pst.setInt(1, 2);
	            pst.setString(2, "st1");
	            pst.setString(3, "roma");
	            pst.setString(4, "firenze");
	            pst.setInt(5, 100);
	                        
	            pst.executeUpdate();//fine inserimento tupla*/
	            
	        	
	        	///prova del metodo recuperaIDlibDB        	
	        	/*ElencoLibriDAO eld = new ElencoLibriDAO();								
				//int id=eld.recuperaIDlibDB("momo","michael ende");
	        	boolean el = eld.elimina2("la storia infinita", "michael ende");
	        	System.out.println(el);///fine prova metodo*/ 
	        	
	        	
	        	//per cancellare tupla
	        	/*String delete = "DELETE FROM prenotazioni WHERE id = 6";
	        	PreparedStatement pst = conn.prepareStatement(delete);
	        	pst.executeUpdate();//fine cancellazione tupla*/
	        	
	        	
	        	//inizio decrease id per es. dopo cancellazione
	        	/*Statement stm = conn.createStatement();
	        	String sqldecrease = "update libri set id=id-1 where id > 1";
	            stm.executeUpdate(sqldecrease);
	        	///fine gestione decrease id*/
	            
	        	
	        	//inizio modifica tupla in tabella        	    	
	        	/*int id = 4; 
		        String update = "UPDATE libri SET titolo=?,autori=?,prezzo=? WHERE id="+id;
		        		// and autori='"+autori+"')and prezzo ="+prezzo;
		        PreparedStatement pst = conn.prepareStatement(update);
		        
		        String titolo2 = "momo";
	        	String autori2 = "michael ende";
	        	double prezzo2 = 39;
		        
		        pst.setString(1, titolo2);
		        pst.setString(2, autori2);
		        pst.setDouble(3, prezzo2);

		        int res = pst.executeUpdate();//indica le tuple modificate, se != da 1, errore
		        
		        if (res != 1) {
	                throw new RuntimeException("database error in update!");
	            }//fine modifica tupla*/
	            

	            //memorizza il valore di una tupla voluta in una stringa
	            /*rs.next();
	            String gio = rs.getString(1);
	            System.out.println(gio);//fine della stampa di una singola tupla*/
	                  	
	        	//per stampare tutte le tuple
	    /*Statement st = conn.createStatement();
	    String select = "SELECT * FROM staytemplate";
	    ResultSet rs = st.executeQuery(select);
	            //stampa una singola tupla senza il while sotto
	            //rs.next();
	            //System.out.println(rs.getString(1)+" , "+rs.getString(2)+" , "+rs.getString(3));
	            
	    while (rs.next()) {
	      System.out.println("[ "+rs.getInt(1)+" ]   [ "+rs.getInt(2)+" ]   [ "+rs.getString(3)+" ]"+"  [ "+rs.getString(4)+" ]"+" [ "+rs.getString(5)+" ] "+" [ "+rs.getInt(6)+" ] ");
	    }//fine di stampa delle tuple*/                       

	            //cancella il contenuto della tabella senza cancellarla
		        /*Statement st = conn.createStatement();
		        String sqlWipeAll = "truncate table prenotazioni";
		        st.execute(sqlWipeAll);//fine della cancellazione del contenuto del db*/
	        	
	    //rs.close();
	    //st.close();
        //pst.close();
	    conn.close();    
	            
	  }
	  catch (SQLException ex) {
	  	ex.printStackTrace();
	  }
		    
	}

}
