package Survey;

import java.sql.*;

public class PollList {
    // 문항 초기화(), 입력()을 하기.
    // 문항 초기화가 있다는 것은 질문 인스턴스화가 필요하다는건가??왜??
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/db_survey";
            String user = "root";
            String password = "!yojulab*";

            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("DB연결OK");

            Statement statement = connection.createStatement();
            String survey = "SELECT * FROM survey";
            ResultSet resultSet = statement.executeQuery(survey);
            // while (resultSet.next()) {
            // System.out.println(resultSet.getString("SURVEY"));
            // }
            String surveyID = "'SURVEY_02'";
            survey = "SELECT SURVEY" + "FROM survey" + "WHERE SURVEY_ID = '" + surveyID + "'";
            // if (resultSet.next()) 이렇게 해도 02에 대한 내용이 나오지 않음.
            // if는 그냥 true여서 한줄 나오고 끝남.
            // while은 false가 될때까지 반복함.
            {
                System.out.println(resultSet.getString("SURVEY"));
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}
