package task21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class DBMethods {

    private String url = "jdbc:mysql://109.197.216.90:13306/ATAM_db";
    private String user = "root";
    private String password = "6Ztz3rsrVNeWfbCH";

    public void CreateTable (String tableName) {

        String sql = "CREATE TABLE IF NOT EXISTS " + tableName + " (" +
            "id INT AUTO_INCREMENT PRIMARY KEY, " +
            "login VARCHAR(255) NOT NULL, " +
            "password VARCHAR(255) NOT NULL" +
            ")";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public void AddData(String tableName, String userLogin, String userPassword) {

        String sql = "INSERT INTO " + tableName + " (login, password) VALUES (?, ?)";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, userLogin);
            preparedStatement.setString(2, userPassword);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public void DeleteTable(String tableName) {

        String sql = "DROP TABLE " + tableName + ";";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public Map<String, String> GetData (String tableName) {
        Map<String, String> usersData = new HashMap<>();

        try {
            Connection connection = DriverManager.getConnection(url, user, password);

            String sql = "SELECT login, password FROM " + tableName + ";";
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);

            while (result.next()) {
                String userEmail = result.getString("login");
                String userPassword = result.getString("password");
                usersData.put(userEmail, userPassword);
            }

            System.out.println("-----Obtained users are: " + usersData);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return usersData;

    }

}
