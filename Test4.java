/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test4;

/**
 *
 * @author Shmeeters
 */
import java.sql.*;
public class Test4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //addAccount("Nate17","Happy","Ishmeet");
        System.out.println(checkUserPass("nate","pass1"));
        //test3("nate4");
        //removeItem("Happy");
        //addItem("Desktop","A computer requiring a monitor",10);
        //changeUser("nate1","Ishmeet");
        //changePass("Ishmeet","Letmein1");
        //changeName("Ishmeet","Ishmeet");
        //System.out.println(getPrice(1));
    }
    public static Connection con = null;
    public static ResultSet rs = null;
    
    public static Connection connectDB(){
        try
        {
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:/Users/Shmeeters/NetBeansProjects/Test4/Test1.sqlite");
            return con;
        }
        catch(Exception e){
            return null;
        }
    }
    
    public static void addAccount(String user, String pass, String name){
        String sql = "INSERT INTO users VALUES (\'"+user+"\',\'"+pass+"\',\'"+name+"\')";
        try
        {
            Class.forName("org.sqlite.JDBC");
            con = connectDB();
            Statement stmt = con.createStatement();
            stmt.executeUpdate(sql);
            stmt.close();
            con.close();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        catch(Exception ee)
        {
            ee.printStackTrace();
        }
    }
    
    public static boolean checkUserPass(String user, String pass){
        String sql = "SELECT * FROM users WHERE username = \""+user+"\" and password = \""+pass+"\";";
        try
        {
            Connection con = connectDB();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next()){
                con.close();
                return true;
            }
            else{
                con.close();
                return false;
            }
        }
        catch(Exception ee)
        {
            ee.printStackTrace();
            return false;
        }
    }
    
    public static void removeItem(String name){
        String sql = "DELETE FROM products WHERE name = \""+name+"\";";
        try
        {
            Class.forName("org.sqlite.JDBC");
            con = connectDB();
            Statement stmt = con.createStatement();
            stmt.executeUpdate(sql);
            stmt.close();
            con.close();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        catch(Exception ee)
        {
            ee.printStackTrace();
        }
    }
    
    public static void addItem(String name, String description, int price){
        String sql = "INSERT INTO products VALUES (\'"+name+"\',\'"+description+"\',\'"+price+"\')";
        try
        {
            Class.forName("org.sqlite.JDBC");
            con = connectDB();
            Statement stmt = con.createStatement();
            stmt.executeUpdate(sql);
            stmt.close();
            con.close();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        catch(Exception ee)
        {
            ee.printStackTrace();
        }
    }
    
    public static void changeUser(String username, String newUser){
        String sql = "UPDATE users SET username = \""+newUser+"\" WHERE username = \""+username+"\";";
        try
        {
            Class.forName("org.sqlite.JDBC");
            con = connectDB();
            Statement stmt = con.createStatement();
            stmt.executeUpdate(sql);
            stmt.close();
            con.close();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        catch(Exception ee)
        {
            ee.printStackTrace();
        }
    }
    
    public static void changePass(String username, String newPass){
        String sql = "UPDATE users SET password = \""+newPass+"\" WHERE username = \""+username+"\";";
        try
        {
            Class.forName("org.sqlite.JDBC");
            con = connectDB();
            Statement stmt = con.createStatement();
            stmt.executeUpdate(sql);
            stmt.close();
            con.close();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        catch(Exception ee)
        {
            ee.printStackTrace();
        }
    }
    
    public static void changeName(String username, String newName){
        String sql = "UPDATE users SET name = \""+newName+"\" WHERE username = \""+username+"\";";
        try
        {
            Class.forName("org.sqlite.JDBC");
            con = connectDB();
            Statement stmt = con.createStatement();
            stmt.executeUpdate(sql);
            stmt.close();
            con.close();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        catch(Exception ee)
        {
            ee.printStackTrace();
        }
    }
    
    public static String getProd(int id){
        String sql = "SELECT * FROM products WHERE rowid = \""+id+"\";";
        try
        {
            Connection con = connectDB();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next()){
                String a = rs.getString(1);
                stmt.close();
                con.close();
                return a;
            }
            else{
                String a = "not Found";
                stmt.close();
                con.close();
                return a;
            }
        }
        catch(Exception ee)
        {
            ee.printStackTrace();
            String a = "not Found";
            return a;
        }      
    }
    
    public static String getDesc(int id){
        String sql = "SELECT * FROM products WHERE rowid = \""+id+"\";";
        try
        {
            Connection con = connectDB();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next()){
                String a = rs.getString(2);
                stmt.close();
                con.close();
                return a;
            }
            else{
                String a = "not Found";
                stmt.close();
                con.close();
                return a;
            }
        }
        catch(Exception ee)
        {
            ee.printStackTrace();
            String a = "not Found";
            return a;
        }      
    }
    
    public static int getPrice(int id){
        String sql = "SELECT * FROM products WHERE rowid = \""+id+"\";";
        System.out.println("test");
        try
        {
            Connection con = connectDB();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next()){
                int a = rs.getInt(3);
                stmt.close();
                con.close();
                return a;
            }
            else{
                int a = 0;
                stmt.close();
                con.close();
                return a;
            }
        }
        catch(Exception ee)
        {
            ee.printStackTrace();
            int a = 0;
            return a;
        }      
    }
}
