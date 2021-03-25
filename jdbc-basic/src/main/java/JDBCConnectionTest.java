import java.sql.*;

public class JDBCConnectionTest {
    //We are not "really" handling the exception for now
    public static void main(String[] args) {
        try {
            //Create a connection to the database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_company", "dean", "securePassword");

            //Create a PreparedStatement
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM departments");

            //Prepared Statement contains a query and returns the rows from DB
            ResultSet rs = stmt.executeQuery();

            //Iterate through the ResultSet
            while(rs.next()){
                int deptNo = rs.getInt(1);
                String dName = rs.getString(2);
                String location = rs.getString(3);

                Department tmpDepartment = new Department(deptNo,dName,location);
            }
        }
        catch(SQLException e){
            System.out.println("Something went wrong");
            e.printStackTrace();
        }
        //Process the data
    }
}
