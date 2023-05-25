import java.util.Scanner;

public class pollQuest {
    public static void main(String[] args) {
        // String[] anwbasket = {,};

        // String[] quests = { "1. 교수는 수업 전 강의 목표를 명확히 제시하였습니까?",
        // "2. 강의의 내용은 체계적이고 성의깄게 구성되었는가?",
        // "3. 교수는 강의 내용에 대해 전문적 지식이 있었는가?",
        // "4. 강의 진행 속도는 적절하였는가?" };

        // for (int qnumber = 0; qnumber < quests.length; qnumber = qnumber + 1)

        // {
        // System.out.print ( quests [qnumber] );
        // }
        String[] anwbasket = {,};

        String[][] qanda = { { "1. 교수는 수업 전 강의 목표를 명확히 제시하였습니까?" },
                { "2. 강의의 내용은 체계적이고 성의깄게 구성되었는가?" },
                { "3. 교수는 강의 내용에 대해 전문적 지식이 있었는가?" },
                { "4. 강의 진행 속도는 적절하였는가?" },
                { "(1) 전혀 아니다", "(2) 아니다.", "(3) 그렇다", "(4) 매우그렇다." } };

        for (int ka = 0; ka <= qanda.length; ka = ka + 1) {
            for (int na = 0; na <= qanda[ka].length; na = na + 1) {
                for (int da = 0; da <= qanda[na].length; da = da + 1) {
                    for (int la = 0; la <= qanda[da].length; la = la + 1) {
                        for (int ma = 0; ma <= qanda[la].length; ma = ma + 1) {
                            System.out.println(qanda[ka][ma]);

                        }

                    }
                }

            }

            // System.out.print(qanda[4]);
        }

        // for (int qnumb = 0; qnumb < qanda.length; qnumb = qnumb + 1) {
        // for(int anumb = 0; anumb < qanda[qnumb].length; anumb= anumb +1){
        // System.out.println (qanda[qnumb])};
        // System.out.println(qanda[]);
        // }
        // }

        // return 0;
    }
}