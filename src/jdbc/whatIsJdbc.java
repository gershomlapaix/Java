package jdbc;

import java.sql.*;

public class whatIsJdbc {
    public static void main(String[] args) throws ClassNotFoundException {
        try{

            String sql = "SELECT id, username FROM users WHERE id = ?";
            String url = "jdbc:mysql://localhost:3306/jdbc_course";

//            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, "gershom","lapaix123");
                try{
                    Statement stmt = conn.createStatement();
                    ResultSet resultSet = stmt.executeQuery("Select * from album");
                    while(resultSet.next()){
                        String name = resultSet.getString("albumName");
                        System.out.println(name);
                    }
                }
                catch (SQLException se){
                    throw new Error("Problem", se);
                }
                finally {
                    try{
                        conn.close();
                    }catch (Exception e){
                        System.out.println("Could not close JDBC connection::"+ e);
                    }
                }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
