package subject;

// 문제 1의 Song 클래스
public class Song {
    private String title;

//    기본 생성자; 클래스이름 동일, 매개변수 없음
    public Song(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
