package DB;

import java.sql.Connection;
import java.sql.SQLException;

import java.sql.*;


public class InserimentoTuple {

	public static void main(String[] args) {
		
		Connection conn = DBconnection.getConnection();
		PreparedStatement pst=null;
		String insert=null;
	    try {
		
	    	insert = "INSERT INTO attivita (tipo,citta,descrizione,durata)VALUES (?,?,?,?)";
	    	pst = conn.prepareStatement(insert);            
	    	pst.setString(1, "culturale");
	    	pst.setString(2, "torino");
	    	pst.setString(3, "visita al museo egizio");
	    	pst.setInt(4, 2);
	    	pst.executeUpdate();
	    	
	    	insert = "INSERT INTO attivita (tipo,citta,descrizione,durata)VALUES (?,?,?,?)";
	    	pst = conn.prepareStatement(insert);            
	    	pst.setString(1, "turistica");
	    	pst.setString(2, "foggia");
	    	pst.setString(3, "visita alla cattedrale");
	    	pst.setInt(4, 2);
	    	pst.executeUpdate();
	    		    	
	    	insert = "INSERT INTO attivita (tipo,citta,descrizione,durata)VALUES (?,?,?,?)";
	    	pst = conn.prepareStatement(insert);            
	    	pst.setString(1, "turistica");
	    	pst.setString(2, "roma");
	    	pst.setString(3, "visita al colosseo");
	    	pst.setInt(4, 3);
	    	pst.executeUpdate();
	    	
	    	insert = "INSERT INTO attivita (tipo,citta,descrizione,durata)VALUES (?,?,?,?)";
	    	pst = conn.prepareStatement(insert);            
	    	pst.setString(1, "ludica");
	    	pst.setString(2, "milano");
	    	pst.setString(3, "partita dell'inter");
	    	pst.setInt(4, 2);
	    	pst.executeUpdate();
	    	
	    	insert = "INSERT INTO attivita (tipo,citta,descrizione,durata)VALUES (?,?,?,?)";
	    	pst = conn.prepareStatement(insert);            
	    	pst.setString(1, "sportiva");
	    	pst.setString(2, "firenze");
	    	pst.setString(3, "partita della fiorentina");
	    	pst.setInt(4, 2);
	    	pst.executeUpdate();

	    	insert = "INSERT INTO attivita (tipo,citta,descrizione,durata)VALUES (?,?,?,?)";
	    	pst = conn.prepareStatement(insert);            
	    	pst.setString(1, "turistica");
	    	pst.setString(2, "napoli");
	    	pst.setString(3, "visita al vesuvio");
	    	pst.setInt(4, 2);
	    	pst.executeUpdate();
	    	
	    	insert = "INSERT INTO attivita (tipo,citta,descrizione,durata)VALUES (?,?,?,?)";
	    	pst = conn.prepareStatement(insert);            
	    	pst.setString(1, "turistica");
	    	pst.setString(2, "reggio-calabria");
	    	pst.setString(3, "lungo mare");
	    	pst.setInt(4, 2);
	    	pst.executeUpdate();
	    	
	    	insert = "INSERT INTO attivita (tipo,citta,descrizione,durata)VALUES (?,?,?,?)";
	    	pst = conn.prepareStatement(insert);            
	    	pst.setString(1, "culturale");
	    	pst.setString(2, "roma");
	    	pst.setString(3, "visita ai fori romani");
	    	pst.setInt(4, 2);
	    	pst.executeUpdate();
	    	
	    	insert = "INSERT INTO attivita (tipo,citta,descrizione,durata)VALUES (?,?,?,?)";
	    	pst = conn.prepareStatement(insert);            
	    	pst.setString(1, "turistica");
	    	pst.setString(2, "roma");
	    	pst.setString(3, "visita ponte sisto");
	    	pst.setInt(4, 1);
	    	pst.executeUpdate();
	    	
	    	insert = "INSERT INTO attivita (tipo,citta,descrizione,durata)VALUES (?,?,?,?)";
	    	pst = conn.prepareStatement(insert);            
	    	pst.setString(1, "turistica");
	    	pst.setString(2, "roma");
	    	pst.setString(3, "visita piazza di spagna");
	    	pst.setInt(4, 2);
	    	pst.executeUpdate();
	    	
	    	insert = "INSERT INTO attivita (tipo,citta,descrizione,durata)VALUES (?,?,?,?)";
	    	pst = conn.prepareStatement(insert);            
	    	pst.setString(1, "culturale");
	    	pst.setString(2, "venaria");
	    	pst.setString(3, "visita alla reggia");
	    	pst.setInt(4, 3);
	    	pst.executeUpdate();
	    	
	    	
	    	
	    	
	    	insert = "INSERT INTO utenti (username,password,tipo)VALUES (?,?,?)";
	    	pst = conn.prepareStatement(insert);            
	    	pst.setString(1, "antonio");
	    	pst.setString(2, "p1");
	    	pst.setString(3, "TA");
	    	pst.executeUpdate();
	    		    	
	    	insert = "INSERT INTO utenti (username,password,tipo)VALUES (?,?,?)";
	    	pst = conn.prepareStatement(insert);            
	    	pst.setString(1, "lucia");
	    	pst.setString(2, "p2");
	    	pst.setString(3, "TA");
	    	pst.executeUpdate();
	    		    	
	    	insert = "INSERT INTO utenti (username,password,tipo)VALUES (?,?,?)";
	    	pst = conn.prepareStatement(insert);            
	    	pst.setString(1, "filomena");
	    	pst.setString(2, "p3");
	    	pst.setString(3, "customer");
 			pst.executeUpdate();
	    	
	    	
	    	
	    	
	    	insert = "INSERT INTO itinerario(creatoruser,startloc,endloc,durata,itname,itdesc,itcategory,stato,prezzo)VALUES (?,?,?,?,?,?,?,?,?)";
	    	pst = conn.prepareStatement(insert);            
	    	pst.setString(1, "filomena");
	    	pst.setString(2, "torino");
	    	pst.setString(3, "roma");
	    	pst.setInt(4, 3);
	    	pst.setString(5, "to-rm");
	    	pst.setString(6, "part:8.00 arr:10.00");
	    	pst.setString(7, "culturale-turistico");
	    	pst.setString(8, "completo");
	    	pst.setFloat(9, 100);
 			pst.executeUpdate();
	    	
	    	insert = "INSERT INTO itinerario(creatoruser,startloc,endloc,durata,itname,itdesc,itcategory,stato,prezzo)VALUES (?,?,?,?,?,?,?,?,?)";
	    	pst = conn.prepareStatement(insert);            
	    	pst.setString(1, "antonio");
	    	pst.setString(2, "roma");
	    	pst.setString(3, "milano");
	    	pst.setInt(4, 4);
	    	pst.setString(5, "rm-mi");
	    	pst.setString(6, "part:7.00 arr:12.00");
	    	pst.setString(7, "culturale-turistico");
	    	pst.setString(8, "completo");
	    	pst.setFloat(9, 100);
 			pst.executeUpdate();
 			
 			insert = "INSERT INTO itinerario(creatoruser,startloc,endloc,durata,itname,itdesc,itcategory,stato,prezzo)VALUES (?,?,?,?,?,?,?,?,?)";
	    	pst = conn.prepareStatement(insert);            
	    	pst.setString(1, "lucia");
	    	pst.setString(2, "milano");
	    	pst.setString(3, "roma");
	    	pst.setInt(4, 5);
	    	pst.setString(5, "mi-rm");
	    	pst.setString(6, "part:9.00 arr:16.00");
	    	pst.setString(7, "culturale-turistico");
	    	pst.setString(8, "completo");
	    	pst.setFloat(9, 100);
 			pst.executeUpdate();
	    	
 			insert = "INSERT INTO itinerario(creatoruser,startloc,endloc,durata,itname,itdesc,itcategory,stato,prezzo)VALUES (?,?,?,?,?,?,?,?,?)";
	    	pst = conn.prepareStatement(insert);            
	    	pst.setString(1, "lucia");
	    	pst.setString(2, "napoli");
	    	pst.setString(3, "firenze");
	    	pst.setInt(4, 7);
	    	pst.setString(5, "na-fi");
	    	pst.setString(6, "part:8.00 arr:20.00");
	    	pst.setString(7, "culturale-turistico");
	    	pst.setString(8, "completo");
	    	pst.setFloat(9, 100);
 			pst.executeUpdate();
	    	
 			insert = "INSERT INTO itinerario(creatoruser,startloc,endloc,durata,itname,itdesc,itcategory,stato,prezzo)VALUES (?,?,?,?,?,?,?,?,?)";
	    	pst = conn.prepareStatement(insert);            
	    	pst.setString(1, "antonio");
	    	pst.setString(2, "roma");
	    	pst.setString(3, "reggio-calabria");
	    	pst.setInt(4, 10);
	    	pst.setString(5, "rm-rc");
	    	pst.setString(6, "part:10.00 arr:18.00");
	    	pst.setString(7, "culturale-turistico");
	    	pst.setString(8, "completo");
	    	pst.setFloat(9, 100);
 			pst.executeUpdate();
 			
 			insert = "INSERT INTO itinerario(creatoruser,startloc,endloc,durata,itname,itdesc,itcategory,stato,prezzo)VALUES (?,?,?,?,?,?,?,?,?)";
	    	pst = conn.prepareStatement(insert);            
	    	pst.setString(1, "antonio");
	    	pst.setString(2, "milano");
	    	pst.setString(3, "napoli");
	    	pst.setInt(4, 5);
	    	pst.setString(5, "mi-na");
	    	pst.setString(6, "part:11.00 arr:22.00");
	    	pst.setString(7, "culturale-turistico");
	    	pst.setString(8, "completo");
	    	pst.setFloat(9, 100);
 			pst.executeUpdate();
 			
 			
 			
 			
	    	insert = "INSERT INTO staytemplate(iditinerario,nomest,startloc,endloc,prezzo)VALUES (?,?,?,?,?)";
	    	pst = conn.prepareStatement(insert);            
	    	pst.setInt(1, 1);
	    	pst.setString(2, "st1");
	    	pst.setString(3, "torino");
	    	pst.setString(4, "roma");
	    	pst.setFloat(5, 100);
 			pst.executeUpdate();
 			
 			insert = "INSERT INTO staytemplate(iditinerario,nomest,startloc,endloc,prezzo)VALUES (?,?,?,?,?)";
	    	pst = conn.prepareStatement(insert);            
	    	pst.setInt(1, 2);
	    	pst.setString(2, "st2");
	    	pst.setString(3, "roma");
	    	pst.setString(4, "milano");
	    	pst.setFloat(5, 100);
 			pst.executeUpdate();
 			
 			insert = "INSERT INTO staytemplate(iditinerario,nomest,startloc,endloc,prezzo)VALUES (?,?,?,?,?)";
	    	pst = conn.prepareStatement(insert);            
	    	pst.setInt(1, 3);
	    	pst.setString(2, "st3");
	    	pst.setString(3, "milano");
	    	pst.setString(4, "roma");
	    	pst.setFloat(5, 100);
 			pst.executeUpdate();
 			
 			insert = "INSERT INTO staytemplate(iditinerario,nomest,startloc,endloc,prezzo)VALUES (?,?,?,?,?)";
	    	pst = conn.prepareStatement(insert);            
	    	pst.setInt(1, 4);
	    	pst.setString(2, "st4");
	    	pst.setString(3, "napoli");
	    	pst.setString(4, "firenze");
	    	pst.setFloat(5, 100);
 			pst.executeUpdate();
	    	
 			insert = "INSERT INTO staytemplate(iditinerario,nomest,startloc,endloc,prezzo)VALUES (?,?,?,?,?)";
	    	pst = conn.prepareStatement(insert);            
	    	pst.setInt(1, 5);
	    	pst.setString(2, "st5");
	    	pst.setString(3, "roma");
	    	pst.setString(4, "reggio-calabria");
	    	pst.setFloat(5, 100);
 			pst.executeUpdate();
	    	
 			insert = "INSERT INTO staytemplate(iditinerario,nomest,startloc,endloc,prezzo)VALUES (?,?,?,?,?)";
	    	pst = conn.prepareStatement(insert);            
	    	pst.setInt(1, 6);
	    	pst.setString(2, "st6");
	    	pst.setString(3, "milano");
	    	pst.setString(4, "napoli");
	    	pst.setFloat(5, 100);
 			pst.executeUpdate();
 			
 			
 			
 			
 			
 			insert = "INSERT INTO leaf(idstaytemplate,typeleaf,durata,veicolo,startloc,endloc)VALUES (?,?,?,?,?,?)";
	    	pst = conn.prepareStatement(insert);            
	    	pst.setInt(1, 1);
	    	pst.setString(2, "accomodation");
	    	pst.setString(3, "1 giorno");
	    	pst.setString(4, null);
	    	pst.setString(5, "torino");
	    	pst.setString(6, "torino");
 			pst.executeUpdate();
 			
	    	insert = "INSERT INTO leaf(idstaytemplate,typeleaf,durata,veicolo,startloc,endloc)VALUES (?,?,?,?,?,?)";
	    	pst = conn.prepareStatement(insert);            
	    	pst.setInt(1, 1);
	    	pst.setString(2, "transport");
	    	pst.setString(3, "1 giorno");
	    	pst.setString(4, "auto");
	    	pst.setString(5, "torino");
	    	pst.setString(6, "firenze");
 			pst.executeUpdate();
 			
 			insert = "INSERT INTO leaf(idstaytemplate,typeleaf,durata,veicolo,startloc,endloc)VALUES (?,?,?,?,?,?)";
	    	pst = conn.prepareStatement(insert);            
	    	pst.setInt(1, 1);
	    	pst.setString(2, "accomodation");
	    	pst.setString(3, "1 giorno");
	    	pst.setString(4, null);
	    	pst.setString(5, "firenze");
	    	pst.setString(6, "firenze");
 			pst.executeUpdate();
 			
 			insert = "INSERT INTO leaf(idstaytemplate,typeleaf,durata,veicolo,startloc,endloc)VALUES (?,?,?,?,?,?)";
	    	pst = conn.prepareStatement(insert);            
	    	pst.setInt(1, 1);
	    	pst.setString(2, "transport");
	    	pst.setString(3, "1 giorno");
	    	pst.setString(4, "treno");
	    	pst.setString(5, "firenze");
	    	pst.setString(6, "roma");
 			pst.executeUpdate();
 			
 			insert = "INSERT INTO leaf(idstaytemplate,typeleaf,durata,veicolo,startloc,endloc)VALUES (?,?,?,?,?,?)";
	    	pst = conn.prepareStatement(insert);            
	    	pst.setInt(1, 5);
	    	pst.setString(2, "transport");
	    	pst.setString(3, "4 giorni");
	    	pst.setString(4, "auto");
	    	pst.setString(5, "roma");
	    	pst.setString(6, "foggia");
 			pst.executeUpdate();
 			
 			insert = "INSERT INTO leaf(idstaytemplate,typeleaf,durata,veicolo,startloc,endloc)VALUES (?,?,?,?,?,?)";
	    	pst = conn.prepareStatement(insert);            
	    	pst.setInt(1, 5);
	    	pst.setString(2, "accomodation");
	    	pst.setString(3, "1 giorno");
	    	pst.setString(4, null);
	    	pst.setString(5, "foggia");
	    	pst.setString(6, "foggia");
 			pst.executeUpdate();
 			
 			insert = "INSERT INTO leaf(idstaytemplate,typeleaf,durata,veicolo,startloc,endloc)VALUES (?,?,?,?,?,?)";
	    	pst = conn.prepareStatement(insert);            
	    	pst.setInt(1, 5);
	    	pst.setString(2, "transport");
	    	pst.setString(3, "4 giorni");
	    	pst.setString(4, "auto");
	    	pst.setString(5, "foggia");
	    	pst.setString(6, "reggio-calabria");
 			pst.executeUpdate();
 			
 			insert = "INSERT INTO leaf(idstaytemplate,typeleaf,durata,veicolo,startloc,endloc)VALUES (?,?,?,?,?,?)";
	    	pst = conn.prepareStatement(insert);            
	    	pst.setInt(1, 1);
	    	pst.setString(2, "transport");
	    	pst.setString(3, "1 giorno");
	    	pst.setString(4, "auto");
	    	pst.setString(5, "torino");
	    	pst.setString(6, "venaria");
 			pst.executeUpdate();
 			
 			insert = "INSERT INTO leaf(idstaytemplate,typeleaf,durata,veicolo,startloc,endloc)VALUES (?,?,?,?,?,?)";
	    	pst = conn.prepareStatement(insert);            
	    	pst.setInt(1, 1);
	    	pst.setString(2, "accomodation");
	    	pst.setString(3, "2 giorni");
	    	pst.setString(4, null);
	    	pst.setString(5, "venaria");
	    	pst.setString(6, "venaria");
 			pst.executeUpdate();
 			
 			insert = "INSERT INTO leaf(idstaytemplate,typeleaf,durata,veicolo,startloc,endloc)VALUES (?,?,?,?,?,?)";
	    	pst = conn.prepareStatement(insert);            
	    	pst.setInt(1, 1);
	    	pst.setString(2, "transport");
	    	pst.setString(3, "4 giorni");
	    	pst.setString(4, "treno");
	    	pst.setString(5, "venaria");
	    	pst.setString(6, "firenze");
 			pst.executeUpdate();
 			
 			insert = "INSERT INTO leaf(idstaytemplate,typeleaf,durata,veicolo,startloc,endloc)VALUES (?,?,?,?,?,?)";
	    	pst = conn.prepareStatement(insert);            
	    	pst.setInt(1, 6);
	    	pst.setString(2, "accomodation");
	    	pst.setString(3, "1 giorno");
	    	pst.setString(4, null);
	    	pst.setString(5, "napoli");
	    	pst.setString(6, "napoli");
 			pst.executeUpdate();
	    	
 			
 			
 			
 			insert ="insert into attivita_st(idstaytempl,durata,idactivity,obbligatoria) values(?,?,?,?)";
 			pst = conn.prepareStatement(insert);
 			pst.setInt(1, 1);
 			pst.setInt(2, 2);
 			pst.setInt(3, 2);
 			pst.setString(4, "si");
 			pst.executeUpdate();
 			
 			insert ="insert into attivita_st(idstaytempl,durata,idactivity,obbligatoria) values(?,?,?,?)";
 			pst = conn.prepareStatement(insert);
 			pst.setInt(1, 2);
 			pst.setInt(2, 2);
 			pst.setInt(3, 3);
 			pst.setString(4, "si");
 			pst.executeUpdate();
 			
 			
 			
 			
 			insert="INSERT INTO OPT(NOME,DESCRIZIONE) values(?,?)";
 			pst=conn.prepareStatement(insert);
 			pst.setString(1,"piscina");
 			pst.setString(2, "aperta 8:00-22:00");
 			pst.executeUpdate();
 			
 			insert="INSERT INTO OPT(NOME,DESCRIZIONE) values(?,?)";
 			pst=conn.prepareStatement(insert);
 			pst.setString(1,"palestra");
 			pst.setString(2, "aperta 10:00-20:00");
 			pst.executeUpdate();
 			
 			insert="INSERT INTO OPT(NOME,DESCRIZIONE) values(?,?)";
 			pst=conn.prepareStatement(insert);
 			pst.setString(1,"servizio in camera");
 			pst.setString(2, "orario continuato");
 			pst.executeUpdate();
 			
 			
 			
 			
 			insert="insert into option_leaf(idleaf,idoption)values(?,?)";
 			pst=conn.prepareStatement(insert);
 			pst.setInt(1, 3);
 			pst.setInt(2, 3);
 			pst.executeUpdate();
 			
 			insert="insert into option_leaf(idleaf,idoption)values(?,?)";
 			pst=conn.prepareStatement(insert);
 			pst.setInt(1, 1);
 			pst.setInt(2, 2);
 			pst.executeUpdate();
 			
 			insert="insert into option_leaf(idleaf,idoption)values(?,?)";
 			pst=conn.prepareStatement(insert);
 			pst.setInt(1, 11);
 			pst.setInt(2, 1);
 			pst.executeUpdate();
 			
 			
 			
 			
 			insert="insert into viaggio(creatoruser,iditinerario,startDate,endDate,costo,npersone,acquistato)values(?,?,?,?,?,?,?)";
 			pst=conn.prepareStatement(insert);
 			pst.setString(1, "filomena");
 			pst.setInt(2, 1);
 			pst.setString(3, "08-agosto-2014");
 			pst.setString(4, "15-agosto-2014");
 			pst.setFloat(5, 100);
 			pst.setInt(6, 3);
 			pst.setString(7, "si");
 			pst.executeUpdate();
 			
 			insert="insert into viaggio(creatoruser,iditinerario,startDate,endDate,costo,npersone,acquistato)values(?,?,?,?,?,?,?)";
 			pst=conn.prepareStatement(insert);
 			pst.setString(1, "antonio");
 			pst.setInt(2, 2);
 			pst.setString(3, "03-agosto-2014");
 			pst.setString(4, "25-agosto-2014");
 			pst.setFloat(5, 100);
 			pst.setInt(6, 3);
 			pst.setString(7, "no");
 			pst.executeUpdate();
 			
 			
 			
 			
 			insert="insert into attivita_leaf(idleaf,idactivity)values(?,?)";
 			pst=conn.prepareStatement(insert);
 			pst.setInt(1, 3);
 			pst.setInt(2, 4);
 			pst.executeUpdate();
 			
 			insert="insert into attivita_leaf(idleaf,idactivity)values(?,?)";
 			pst=conn.prepareStatement(insert);
 			pst.setInt(1, 9);
 			pst.setInt(2, 4);
 			pst.executeUpdate();
 			
 			insert="insert into attivita_leaf(idleaf,idactivity)values(?,?)";
 			pst=conn.prepareStatement(insert);
 			pst.setInt(1, 6);
 			pst.setInt(2, 2);
 			pst.executeUpdate();
 			
 			
	    }
	    
	    catch (SQLException ex) {
		  	ex.printStackTrace();
		}
	    	
		
		

	}

}
