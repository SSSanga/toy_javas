package Survey;

import java.sql.*;
import java.util.ArrayList;

public class PollsOnlySQL {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/db_survey";
            String user = "root";
            String password = "!yojulab*";
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("DB연결OK");
            Statement statement = connection.createStatement();

            String survey = "SELECT USER FROM user";
            ResultSet resultSet = statement.executeQuery(survey);

            while (resultSet.next()) {
                System.out.println(resultSet.getString("USER"));
                // ArrayList<String> arrayList = new ArrayList<String>();
                // arrayList.add(resultSet.getString(survey));
                // System.out.println(arrayList);
            }
             survey = "SELECT SURVEY FROM survey";
             resultSet = statement.executeQuery(survey);

            while (resultSet.next()) {
                System.out.println(resultSet.getString("SURVEY"));
                // ArrayList<String> arrayList = new ArrayList<String>();
                // arrayList.add(resultSet.getString(survey));
                // System.out.println(arrayList);
            }
            survey = "SELECT ANSWER FROM answer";
             resultSet = statement.executeQuery(survey);

            while (resultSet.next()) {
                System.out.println(resultSet.getString("ANSWER"));
                // ArrayList<String> arrayList = new ArrayList<String>();
                // arrayList.add(resultSet.getString(survey));
                // System.out.println(arrayList);
            }
            // 이 모양은 질문과 답항의 종속이 아님. 종속적으로 하려면? 15:53
            

            
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println("END");
    }
}
