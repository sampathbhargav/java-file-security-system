package jfss;

import java.sql.*;
import java.io.*;

class insertvalues
{
public static void main(String args[])throws Exception
{
try{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","password");
PreparedStatement st=con.prepareStatement("insert into student values(?,?)");
st.setString(1,"12");
st.setString(2,"rags");
int i=st.executeUpdate();
System.out.println(i+" recods inserted");
st.close();
con.close();
}
catch(Exception e){
	System.out.println(e);
}
}
}