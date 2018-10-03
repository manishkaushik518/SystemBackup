package bean;  
import java.sql.*;  
import static bean.Provider.*; 
import oracle.jdbc.driver.*;

  
public class ConnectionProvider {  
private static Connection con=null;  
static{  
try{  
Class.forName(DRIVER);  
con=DriverManager.getConnection(CONNECTION_URL,USERNAME,PASSWORD);  
}catch(Exception e){
	System.out.println("Error");
	e.printStackTrace();
}  
}  
  
public static Connection getCon(){  
    return con;  
}  
  
}  