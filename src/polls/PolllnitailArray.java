package polls;

public class PolllnitailArray {
    
    int a = 0;

    public String[][] Arrays() {
        String[][] Que = {
            { "1. 교수는 수업 전 강의 목표를 명확히 제시하였습니까?" },
            { "2. 강의의 내용은 체계적이고 성의있게 구성되었는가?" },
            { "3. 교수는 강의 내용에 대해 전문적 지식이 있었는가?" },
            { "4. 강의 진행 속도는 적절하였는가?" }
        };

        for (a = 0; a < 4; a++) {
            System.out.println(Que[a][0]);
        }

        return Que;
            
        }
    }

    