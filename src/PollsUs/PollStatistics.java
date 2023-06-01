package PollsUs;

public class PollStatistics {

    public int printAnswers(String[] answers) {
        {
            try {
                for (int first = 0; first < answers.length; first = first + 1) {
                    System.out.print(answers[first] + ", ");
                }
            } catch (Exception e) {
                // TODO: handle exception
            }return 1;
        }
        
        // 성공하면 return 1, 실패하면 return 0 ;
    }
}
// void는 return 혹은 parameter값이 없을때 사용.
// 하지만 void 사용하지 않음.
