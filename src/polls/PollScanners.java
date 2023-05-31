package polls;

import java.util.Scanner;

public class PollScanners {
    int reply = 0;

    public PollScanners() {
    } // PollScanners 초기화

    // public PollScanners(int anw) {
    //     Scanner myOjt = new Scanner(System.in);
    //     anw = myOjt.nextInt();
    //     this.reply = anw;
    //     System.out.println("답 :" + anw);
    // }
public int Getreply (int anw) {
    Scanner myOjt = new Scanner(System.in);
        anw = myOjt.nextInt();
        this.reply = anw;
return this.reply;
}}
// Scanner myOjt//name =myOjt
// String [] answer
// 정답입력->넘어간다, string[]answer 넣어줌.
