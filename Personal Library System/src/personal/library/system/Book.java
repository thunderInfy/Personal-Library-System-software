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
public class Book {
    private String name;
    private int pubyear;
    private float price;
    private String publisher;
    private String purchasedate;
    private int serialno;
    private int book_issued;
    private int borrowed_book;
    private String issue_date;
    private String issue_return_date;
    private String issued_by_name;
    private String borrow_date;
    private String borrowed_by_name;
    
    public static int add(String name,int pubyear,String purchasedate,float price, String publisher,int serialno,int book_issued
            ,String issue_date, String issue_return_date, String issued_by_name, int borrowed_book,
            String borrow_date, String borrowedby_name){
        try{
            Connection c = Sqlregfrnd.getConnection();
            
            PreparedStatement stmt= c.prepareStatement("insert into book_data VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?);");
            stmt.setString(1,name);
            stmt.setInt(2,pubyear);
            stmt.setString(3,purchasedate);
            stmt.setFloat(4,price);
            stmt.setString(5,publisher);
            stmt.setInt(6,0);
            stmt.setInt(7,book_issued);
            stmt.setString(8,issue_date);
            stmt.setString(9,issue_return_date);
            stmt.setString(10,issued_by_name);
            stmt.setInt(11,borrowed_book);
            stmt.setString(12,borrow_date);
            stmt.setString(13,borrowedby_name);
            stmt.executeUpdate();
            return 1;
        }
        
        catch (Exception e){
            System.out.println(e);
            return 0;
        }
        
    }
}
