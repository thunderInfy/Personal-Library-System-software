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
public class Sqlregfrnd {
    public static Connection getConnection(){
        Connection obj = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            obj = DriverManager.getConnection("jdbc:mysql://localhost:3306/PLS?autoReconnect=true&useSSL=false","root","");
            
        }
        catch(Exception e){
            return obj;
        }
        return obj;
    }
}
