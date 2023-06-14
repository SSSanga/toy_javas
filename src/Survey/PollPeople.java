package Survey;

import java.sql.*;

public class PollPeople {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/db_survey";
            String user = "root";
            String password = "!yojulab*";

            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("DB연결OK");

            Statement statement = connection.createStatement();
            String query = "SELECT * FROM user";
            ResultSet resultSet = statement.executeQuery(query); // 여기서 끝내면 확인을 하지 못함.
            while (resultSet.next()) {
                // 값이 끝날때까지 while문을 돌거야.
                System.out.println(resultSet.getString("USER") + ":"
                        + resultSet.getString("USER_ID"));
            }

        } catch (Exception e) {
            System.out.println("설문자 명단 출력");

            // TODO: handle exception
        }

        // 설문자
        // 설문자 가능명단
        // SELECT * FROM USER
        // 이거 HASMPA에 담을수 있겠음??ㄴㄴ일단 명단 불러오기

    }
}
