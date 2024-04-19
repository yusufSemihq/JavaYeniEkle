import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {

    private String userName ="root";
    private String password ="root";
    private String dbUrl = "jdbc:mysql://localhost:3306/mysqljdbc:mysql://localhost/db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";


    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl,userName,password);
    }

    public void showErorMessage(SQLException exception){
        System.out.println("Error: " + exception.getMessage());
        System.out.println("Eror Code: " + exception.getErrorCode());
    }

}
