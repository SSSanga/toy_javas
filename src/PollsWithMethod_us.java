import PollsUs.PollInitailArrays;
import PollsUs.PollScanners;
import PollsUs.PollStatistics;

public class PollsWithMethod_us {
    // 응용프로그램은 시작점이 존재하지 않음.특정 function을 먼저라 하자.= static main으로 정함.

    public static void main(String[] args) {
        try {
            String[][] polls = {
                    { "1. 문항" },
                    { "(1) 답항", "(2) 답항", "(3) 답항" },
                    { "2. 문항" },
                    { "(1) 답항", "(2) 답항", "(3) 답항" },
            }; // 이걸 main에 둠.
               // String [][] polls는 이미 정해진 값 != 파라미터가 되지 않음.
               // 하지만 = 이 것은 변수가 존재한다는 뜻.
            String[] answers = { "", "" };
            PollInitailArrays pollInitailArrays = new PollInitailArrays();
            polls = pollInitailArrays.init(); // 설문내용초기화
            PollScanners pollScanners = new PollScanners(); // 초기화된 polls를 이용해야함.
            answers = pollScanners.pollWithAnswers(polls);
            PollStatistics pollStatistics = new PollStatistics();
            pollStatistics.printAnswers(answers);
        } catch (Exception e) {
            // TODO: handle exception
        }
        // return 0 ;
    }
}
