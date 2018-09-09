/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal.library.system;
import java.sql.*;
/**
 *
 * @author infinity
 */
public class Friend {
    private String name;
    private String address;
    private String no;
    
    public static int add(String name,String address, String no){
        try{
            Connection c = Sqlregfrnd.getConnection();
            PreparedStatement stmt= c.prepareStatement("insert into friend_data VALUES (?,?,?);");
            stmt.setString(1,name);
          
            stmt.setString(2,address);
          
            stmt.setString(3,no);
          
            stmt.executeUpdate();
            return 1;
        }
        
        catch (Exception e){
            System.out.println(e);
            return 0;
        }
        
    }
}
