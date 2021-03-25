import java.sql.*;

public class JDBCConnectionTest {
    //We are not "really" handling the exception for now
    public static void main(String[] args) {
        //Create a connection to the database
        //Create a PreparedStatement
        //Prepared Statement contains a query and returns the rows from DB
        //Iterate through the ResultSet
        //Process the data

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_company", "dean", "securePassword");
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM departments");
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                System.out.println(rs.getString(2));
            }
        }
        catch(SQLException e){
            System.out.println("Something went wrong");
            System.out.println(e.getMessage());
        }
        //Create a Statement with a query
        //Read the ResultSet
    }
}
