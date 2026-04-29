package task5.Part3;

public class Video extends Media {

    final String resolution;

    public Video(String title, int duration, String resolution) {
        super(title, duration);
        this.resolution = resolution;
    }

    @Override
    public void play() {
        System.out.println("Playing \"" + this.getTitle() + "\" at " + resolution + " resolution");
    }
}
