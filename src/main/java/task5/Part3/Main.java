package task5.Part3;

public class Main {

    public static void main(String[] args) {
        Media media = new Media("GIF", 10);
        Music music = new Music("Fame", 4, "Dax");
        Video video = new Video("Java lesson", 20, "720x720");

        media.play();

        music.play();

        video.play();
    }
}
