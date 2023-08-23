import java.sql.*;
public class student{
public static void main(String args[]){
Class.forName("com.mysql.jdbc.Driver");
Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/shiva","root","shiva_123456");
Statement stmt = con.createStatement();
ResultSet rs = stmt.executeQuery("select* from student");
con.close();
}
}
