package Survey;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;


public class PollList {

    public  PollList ()
        {try {
            String url = "jdbc:mysql://localhost:3306/db_survey";
            String user = "root";
            String password = "!yojulab*";

            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("DB연결OK");

            Statement statement = connection.createStatement();
            
            String survey = "SELECT * FROM survey";
            ResultSet resultSet = statement.executeQuery(survey);
            while (resultSet.next()) {
            // System.out.println(resultSet.getString("SURVEY"));
            ArrayList<String> arrayList = new ArrayList<String> ();
            arrayList.add(resultSet.getString(survey));
        } // while로 나오는 답을 array로 담을 수 있지 않나?
            
            // String surveyID = "'SURVEY_02'";
            // survey = "SELECT SURVEY" + "FROM survey" + "WHERE SURVEY_ID = '" + surveyID + "'";
            // // if (resultSet.next()) 이렇게 해도 02에 대한 내용이 나오지 않음.
            // // if는 그냥 true여서 한줄 나오고 끝남.
            // // while은 false가 될때까지 반복함.
            // {
            //     System.out.println(resultSet.getString("SURVEY"));
            // }
        } catch (Exception e) {
            // TODO: handle exception
        }}
    
    

    public String[] PollInput(
            String[] polls) {
                String[] answer = { "", "" };
                try {
                    int count = 0;
                    
                    Scanner myObj = new Scanner(System.in);
                    for (int second=0; second < polls.length; second=second+2){
                        System.out.println(polls);
                        // 답항 출력 본인이 해 보기
            
                        System.out.print("답하기 : ");
                        answer[count] = myObj.nextLine();
                        count = count + 1;
                        System.out.println();
                    }
        } catch (Exception e) {
            // TODO: handle exception
        }
        return answer;
    } //설문자 답을 던진다??
    
    // 문항 초기화(), 입력()을 하기.
    // 문항 초기화가 있다는 것은 질문 인스턴스화가 필요하다는건가??왜??
}