package jfss;

import java.sql.*;
import java.io.*;

class readvalues
{
public static void main(String args[])throws Exception
{
try{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","password");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select * from jfss");
while(rs.next()){
System.out.println(rs.getString(1)+" "+rs.getString(2));
}
con.close();
}
catch(Exception e)
{
System.out.println(e);
}


}
}