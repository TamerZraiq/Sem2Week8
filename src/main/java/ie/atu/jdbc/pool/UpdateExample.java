package ie.atu.jdbc.pool;

import java.sql.*;

public class UpdateExample {
    public static void main(String[] args) {
        String updateSQL = "UPDATE users SET password = 'newpassword' WHERE username = 'Des'";

        try (Connection connection = ie.atu.jdbc.pool.DatabaseUtils.getConnection();
             Statement statement = connection.createStatement()) {
            int rowsUpdated = statement.executeUpdate(updateSQL);
            System.out.println("Rows updated: " + rowsUpdated);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
