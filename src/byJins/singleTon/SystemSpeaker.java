package byJins.singleTon;

public class SystemSpeaker {

    public int systemVol = 5;

    // private static 인스턴스 변수
    private static SystemSpeaker ss;

    // public static getInstance() method 구현
    public static SystemSpeaker getInstance() {
        if (ss == null) {
            ss = new SystemSpeaker();
        }
        return ss;
    }


    // private 생성자
    private SystemSpeaker() {

    }
}
