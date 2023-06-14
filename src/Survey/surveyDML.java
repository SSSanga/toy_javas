package Survey;
import java.util.Scanner;
import java.sql.*;


public class surveyDML {
    public static void main(String[] args) {
        try {
            // - MySQL workbench 실행 : JDBC
            // - User/password와 접속 IP:port 접속
            String url = "jdbc:mysql://localhost:3306/db_cars";
            String user = "root";
            String password = "!yojulab*";
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("DB연결 성공\n");
            // workbench의 DB의 table 더블클릭 (선택)까지 된거.
            // 설문자를 설문자 JAVA에서, 문항 초기화와 입력값을 JAVA에서, 통계를 JAVA에서
            // FUNCTION이랑 DB에서 가져와서 출력하는것. 롸?
             // 1.db에서 질문 가져오고 정답 가져오기
             Statement editors = connection.createStatement();
             
            //
        } catch (Exception e) {
            System.out.println();
            // TODO: handle exception
        }
    }
}
