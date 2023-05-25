import java.util.Scanner;

public class pollconfusion {
    public static void main(String[] args) {
        String[] anwbasket = {,};

        String[] quests = { "1. 교수는 수업 전 강의 목표를 명확히 제시하였습니까?",
                "2. 강의의 내용은 체계적이고 성의깄게 구성되었는가?",
                "3. 교수는 강의 내용에 대해 전문적 지식이 있었는가?",
                "4. 강의 진행 속도는 적절하였는가?" };

        for (int qnumber = 0; qnumber < quests.length; qnumber = qnumber + 1) {
            System.out.print(quests[qnumber]);

            String[] answers = { " ", "전혀아니다", "아니다.", "그렇다", "매우그렇다." };
            System.out.println (answers);

            Scanner myObj = new Scanner(System.in);
            int write = 0;

            write = myObj.nextInt();

            System.out.println("(" + write + ") ");
        }

    }

    // return 0;

}
