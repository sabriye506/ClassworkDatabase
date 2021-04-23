package horizoncolumbus.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {
    Connection connection = null;

    String url = "jdbc:sqlite:Resources/scratch.sql";

    try {

    connection = DriverManager.getConnection(url);
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
    String sqlCommand = "create table students " + "(id INTEGER, student_name TEXT, grade_level INTEGER, favorite_subject TEXT);";
       try {
           Statement statement = connection.createStatement();
            statement.execute(sqlCommand);
       }
        catch(SQLException e){
               System.out.println(e.getMessage());
           }




    }

    }
