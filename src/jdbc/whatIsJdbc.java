package jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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

                    PreparedStatement ps = conn.prepareStatement("insert into album(artist, albumName) values(?,?)");

                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                    do {
                        System.out.println("Enter an artist name : ");
                        String artist = bufferedReader.readLine();

                        System.out.println("Enter the album name : ");
                        String albumName = bufferedReader.readLine();

                        ps.setString(1, artist);
                        ps.setString(2, albumName);

                        int i = ps.executeUpdate();
                        System.out.println(i + "rows affected");

                        System.out.println("Do you want to continue: y/n ");
                        String s = bufferedReader.readLine();
                        if(s.startsWith("n")){
                            break;
                        }

                    }while(true);

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
