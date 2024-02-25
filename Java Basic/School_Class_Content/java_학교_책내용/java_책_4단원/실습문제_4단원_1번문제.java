package java_책_4단원;

class Song
{
    String title;
    public Song(String title)
    {
        this.title = title;
    }
    String getTitle()
    {
        return title;
    }
}
public class 실습문제_4단원_1번문제 {    
    public static void main(String[] args) {
        Song mySong = new Song("Nessun Dorma");
        Song yourSong = new Song("공주는 잠 못 이루고");
        System.out.println("내 노래는 "+mySong.getTitle());
        System.out.println("너 노래는 "+yourSong.getTitle());        
    }
    
}
