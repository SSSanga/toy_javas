import java.util.Scanner;

public class pollconfusion {
    public static void main(String[] args) {
        // String[] anwbasket = {,};
        // String[] writes = {" "," "," "," "};
        Scanner myObj = new Scanner(System.in);
            
        String[] quests = { "1. 교수는 수업 전 강의 목표를 명확히 제시하였습니까?",
                "2. 강의의 내용은 체계적이고 성의깄게 구성되었는가?",
                "3. 교수는 강의 내용에 대해 전문적 지식이 있었는가?",
                "4. 강의 진행 속도는 적절하였는가?" };
        String[] total = {"",""};
        // String[] answers = { " ", "(1)", "(2)", "(3)", "(4)" };

        for (int qnumber = 0; qnumber < quests.length; qnumber = qnumber + 1) {
            System.out.println(quests[qnumber]);
            System.out.println("(1) 전혀 아니다." + "(2) 아니다." + "(3) 그렇다." + "(4) 매우 그렇다.");
            int count = 0;
            total[count] = myObj.nextLine();
            count = count + 1;
            // System.out.println (answers[count]);
            }
            for (int reply = 0; reply < total.length; reply = reply +1){
                System.out.print (total[reply] + "/");
            }
            System.out.println();

        }
        // return 0;
    }


