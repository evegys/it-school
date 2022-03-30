package kg.itschool.megacom.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface CrudDao<Model> {
    Model save (Model model);//create
    Model findById(Long id);//select

    default Connection getConnection() throws SQLException{

        final String URL = "jdbc:postgresql://localhost:1234/crm";
        final String USERNAME = "postgres";
        final String PASSWORD = "1234";

        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}
