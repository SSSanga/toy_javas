import polls.PollScanners;
import java.util.Scanner; //정답입력
import polls.PolllnitailArray; //array 항목

public class PollSangaTemp {
    int a = 0;

    public static void main(String[] args) {
        
        PolllnitailArray quest = new PolllnitailArray();
        String[][] numberquest = quest.Arrays();
        System.out.println(numberquest);PollScanners response = new PollScanners();
        // Scanner myname = new Scanner (System.in);
        // String iam = myname.nextSting();
        
        
        for (int i = 0; i < numberquest.length; i++) {
            for (int j = 0; j < numberquest[i].length; j++) {
                System.out.println(numberquest[i][j]);
                int myrespond = response.Getreply(0);
            }
        }

        System.out.println();

        System.out.println("END");

    }
}
