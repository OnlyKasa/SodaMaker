package ConnectDB.SQLsever;
import java.sql.* ;
/**
 *
 * @author MrYiYi
 */
public class ConnectDB{
    public Connection conn = null;
    private String dbName = null;
    private String user= null ;
    private String password=null;
    private String url=null ;
    private String servername=null;
    public ConnectDB(){  
        dbName="SodaMaker";
        user="mr";
        password="quang95";
        servername="ASUS\\SQLEXPRESS";
    }
    public void setServername(String servername){
        this.servername=servername;
    }
    public String getDbName(){
        return dbName ;
    }
    public void setDbName(String dbName){
        this.dbName=dbName ;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public boolean getConnect(){   
        builtURL();
        try
        {
          // Step 1: "Load" the JDBC driver
          Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
          //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
          // Step 2: Establish the connection to the database 
          this.conn = DriverManager.getConnection(url); 
          if (conn==null){
              System.err.print("fall");
              return false;
          }
                  else {
              System.err.print("succes");  
              return true;
          }
        }
    catch (ClassNotFoundException | SQLException e)
    {
      System.err.println("oh!Got an exception!"); 
      System.err.println(e.getMessage());
      return false ;
    }
        
 } 
    public void builtURL(){
            this.url="jdbc:sqlserver://"+this.servername+";databaseName="+this.dbName+
                    ";User="+this.user+";Password="+this.password;
    }
    //runUpdate return number column be changed in Sql sever
    public  int runUpdate(String sql)throws SQLException{
        Statement sta = conn.createStatement();
        return sta.executeUpdate(sql);
    }
    //runSql return resultset , use for command select
    public ResultSet runSql(String sql) throws SQLException {
		Statement sta = conn.createStatement();
		return sta.executeQuery(sql);
	}
    
}