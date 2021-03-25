import java.sql.*;
import java.util.ArrayList;

public class JDBCConnectionTest {
    //We are not "really" handling the exception for now
    public static void main(String[] args) {

        ArrayList<Department> deptArr = new ArrayList<>();
        ArrayList<Employees> empArr = new ArrayList<>();

        try {
            //Create a connection to the database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/exercise_15-03", "Patrick", "beethoven");

            //Create a PreparedStatement
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM dept");
            PreparedStatement stmt2 = conn.prepareStatement("SELECT * FROM emp");

            //Prepared Statement contains a query and returns the rows from DB
            ResultSet rs = stmt.executeQuery();
            ResultSet rs2 = stmt2.executeQuery();

            //Iterate through the ResultSet
            while(rs.next()){
                int deptNo = rs.getInt(1);
                String dName = rs.getString(2);
                String location = rs.getString(3);

                Department tmpDepartment = new Department(deptNo,dName,location);
                deptArr.add(tmpDepartment);

                //System.out.println(deptNo + " " + dName + " " + location);
                //System.out.println(tmpDepartment);

            }

            for (int i = 0; i < deptArr.size(); i++){
                //System.out.println(deptArr.get(i));
            }


            while (rs2.next()){
                int empNo = rs2.getInt(1);
                String eName = rs2.getString(2);
                String job = rs2.getString(3);
                int mgrNo = rs2.getInt(4);
                String hiredate = rs2.getString(5);
                int sal = rs2.getInt(6);
                int comm = rs2.getInt(7);
                int deptNo = rs2.getInt(8);

                Employees emps = new Employees(empNo, eName, job, mgrNo, hiredate, sal, comm, deptNo);
                empArr.add(emps);
            }

            for (int i = 0; i < empArr.size(); i++){
                System.out.println(empArr.get(i));
            }


        }
        catch(SQLException e){
            System.out.println("Something went wrong");
            e.printStackTrace();
        }
        //Process the data
    }
}
