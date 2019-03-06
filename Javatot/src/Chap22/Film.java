package Chap22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
//import java.sql.*;

public class Film {  
    
    protected void list(){
        Connection con;
        Statement stmt;
        ResultSet rs;
       
        // list all film by title and descr
        // try..catch = exceotion/err handling
        // code berada dalam try, catch bila berlaku err
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3308/sakila?useLegacyDatetimeCode=false&serverTimezone=America/New_York", "root", "");
            
            String sql = "SELECT * FROM film LIMIT 10";
            // create an instance of the statement object
            stmt = con.createStatement();
            // execute sql
            rs = stmt.executeQuery(sql);
            //result
            while(rs.next()){
                //System.out.printf("%s",rs.getInt("film_id") + ". " + rs.getString("title"));
                //System.out.println("Description : " + rs.getString("description"));                
                //System.out.println(id + "." + " Title : " + title + ", Description : " + desc);
                System.out.print(rs.getInt("film_id") + ". " + rs.getString("title") + "\t");
                System.out.println(rs.getString("description"));                 
            }
            
        } catch (Exception e) {
            //System.out.println("error conn");
            System.out.println(e.getMessage());
        }
    }
    
    public static void main(String[] args) {        
        Film f = new Film();
        f.list();
        //new Film().list(); -> shortcut
    }
}
