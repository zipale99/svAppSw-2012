package DB;

import java.sql.*;
//import java.sql.Connection;
//import java.util.*;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import java.util.logging.Level;
//import java.util.logging.Logger;

public class DBagenzia {
		
	public static void main(String[] args) {
	       
		Connection conn = DBconnection.getConnection();
		
	    try {
	         
	        	//per creare la tabella
	        	/*String create = "CREATE TABLE utenti("+
	        					"username VARCHAR(10),"+
	        					"password VARCHAR(10),"+
	        					"tipo VARCHAR(20),"+  
	        					"PRIMARY KEY (username))";*/
	        	
	    	/*String create = "CREATE TABLE itinerario("+
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
					"FOREIGN KEY (creatorUser) REFERENCES UTENTI (username))";*/
	    	
	    	/*String create = "CREATE TABLE STAYTEMPLATE("+
	    					"idStayTempl INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"+
	    					"idItinerario INTEGER,"+
	    					"nomeST varchar (20),"+
	    					"startLoc varchar (20),"+
	    					"endLoc varchar (20),"+
	    					"prezzo float(10) not null,"+
	    					"PRIMARY KEY (idStayTempl),"+
	    					"FOREIGN KEY (idItinerario) REFERENCES ITINERARIO (idItinerario))";
	        	
	        	PreparedStatement pst = conn.prepareStatement(create);
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
	    Statement st = conn.createStatement();
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
	    conn.close();    
	            
	  }
	  catch (SQLException ex) {
	  	ex.printStackTrace();
	  }
		    
	}

}
