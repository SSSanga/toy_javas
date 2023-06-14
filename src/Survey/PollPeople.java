package Survey;

import java.sql.*;

public class PollPeople {
    public static void main(String[] args) {
        try {
            // 설문자를 db로 불러와 출력해봄.
            // 출력된 값들을 hashmap을 만들 수 잇지 않음??
            // 이 db부터를 method화 할 수 있는 건가???
            String url = "jdbc:mysql://localhost:3306/db_survey";
            String user = "root";
            String password = "!yojulab*";

            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("DB연결OK");

            Statement statement = connection.createStatement();
            String query = "SELECT * FROM user";
            ResultSet resultSet = statement.executeQuery(query); 
            while (resultSet.next()) {
                // 값이 끝날때까지 while문을 돌거야.
                System.out.println(resultSet.getString("USER") + ":"
                        + resultSet.getString("USER_ID")); //이걸 hashmap으로 만들 수 잇음???
            }
            System.out.println("설문자 명단 출력"); // 왜 여기서 끝나죠????

        } catch (Exception e) {

            System.out.println("?"); //왜 일로 안나가죠???
            // TODO: handle exception
        }

        

    }
}
