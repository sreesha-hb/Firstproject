/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcexample1.jdbc;
import java.sql.*;

/**
 *
 * @author hbsre
 */
public class JDBCExample1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connect = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Sreesha");
        Statement statement = connect.createStatement();
        statement.execute("CREATE TABLE DB02(EMPNO NUMBER, EMPNAME VARCHAR2(30), EMPADDRESS VARCHAR2(30))");
        System.out.println("Table Created Successfully");
    }
    
}
