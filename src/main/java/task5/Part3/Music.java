package task5.Part3;

public class Music extends Media {

    final String artist;

    public Music(String title, int duration, String artist) {
        super(title, duration);
        this.artist = artist;
    }

    @Override
    public void play() {
        System.out.println("Playing \"" + this.getTitle() + "\" by " + this.artist);
    }
}
