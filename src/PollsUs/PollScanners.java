package PollsUs;

import java.util.Scanner;

//원본에서 int = count는 상관없고 변하는 값인 polls만 파라미터도 받아야하며 
//answer에 담아야하는데 이를 바깥으로 내 보낼수있게 이를 return값으로 던져야함. 
public class PollScanners {
    public String[] pollWithAnswers(
            String[][] polls) {
                String[] answers = { "", "" };
                try {
                    int count = 0;
                    
                    Scanner myObj = new Scanner(System.in);
                    for (int second=0; second < polls.length; second=second+2){
                        System.out.println(polls[second][0]);
                        // 답항 출력 본인이 해 보기
            
                        System.out.print("답하기 : ");
                        answers[count] = myObj.nextLine();
                        count = count + 1;
                        System.out.println();
                    } //for문 끝나면 Scanner closing
                myObj.close();
                } catch (Exception e) {
                    // TODO: handle exception
                } return answers;

    }
}
