import java.util.Scanner;

public class pollAnswer {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String [] groupans = {"",""};

        for (int reply = 0; reply < groupans.length;reply= reply + 1){

        }
        int write = 0;
        write = myObj.nextInt();

        String[] answers = { " ", "전혀아니다", "아니다.", "그렇다", "매우그렇다." };
        System.out.print("(" + write + ") " + answers[write]);
        // return 0;
    }
}
