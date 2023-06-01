import polls.PollScanners;
import java.util.Scanner; //정답입력
import polls.PollInitailArray; //array 항목

public class PollSangaTemp {
    int a = 0;

    public static void main(String[] args) {
        
        PollInitailArray quest = new PollInitailArray();
        String[][] numberquest = quest.Arrays(); 
        //이 Temp의 String [][] numberquest는 PollInitailArray를 받아 적용
        System.out.println(numberquest);
        PollScanners response = new PollScanners();
        // Scanner myname = new Scanner (System.in);
        // String iam = myname.nextSting();
        
        //numberquest.length는 PillInitailArray의 Arrays의 length임. 
        for (int i = 0; i < numberquest.length; i= i + 1) {
            for (int j = 0; j < numberquest[i].length; j = j + 1) {
                System.out.println(numberquest[i][j]);
                int myrespond = response.Getreply(0);
            }
        }

        System.out.println();

        System.out.println("END");

    }
}
