package practicespolls;
import java.util.Scanner;
public class PollScanners {

        public int scanners (int y) {
            int x = 0;
            try {
                Scanner my = new Scanner (System.in);
                y = my.nextInt ();
                x = y ;
            } catch (Exception e) {
                // TODO: handle exception
            }
        return x ; 
    }
}
