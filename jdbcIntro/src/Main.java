import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    Connection connection = null;
    DbHelper helper = new DbHelper();
    Statement statement = null;
    ResultSet resultSet = null;

    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        try {
            connection = helper.getConnection();
            Statement = connection.createStatement();
            resultSet = Statement.exceptionQuery("select Code , Name , Contient , Region from country");
            while (result.Set.next());
        } catch (SQLException exception) {
            helper.showErorMessage(exception);
        } finally {
            connection.close();
        }

    }
}