package practicespolls;

import practicespolls.PollScanners;

public class PollInitailArray {
    public String[] Arrays(int y) {
        PollScanners scanner = new PollScanners();

        String[] Que = { "1. 교수는 목표 명확 제시?", "2. 강의내용 체계적?", "3.강의 내용 전문적?", "강의 속도 적절?" };
        String answer = ("(1)전혀 아니다. (2) 아니다. (3)그렇다 (4)매우그렇다");
        try {
            for (int i = 0; i < Que.length; i = i + 1) {
                System.out.println(Que[i]);
                System.out.println(answer);
                int print = scanner.scanners(y);

            }
        } catch (Exception e) {
            // TODO: handle exception
        } return Que;
    }
}
