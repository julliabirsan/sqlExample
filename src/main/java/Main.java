import java.sql.*;

public class Main {

    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jullia2", "root", "rootuser");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from angajat");
        while (resultSet.next()){
            System.out.println(resultSet.getInt("id") + resultSet.getString("nume"));
            if (resultSet.getString("nume").contains("birsan")){
                Statement statement1 = connection.createStatement();
                int result =- statement1.executeUpdate("insert into angajat values (null, 'jutest', 1)");
            }
        }
        System.out.println("test pt git");
    }
}
