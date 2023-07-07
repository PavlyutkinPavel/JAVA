package patterns.hw31.adapter;

public class AudioPlayer implements MediaPlayer {
    @Override
    public void play(String filename) {
        System.out.println("Playing audio: " + filename);
    }

}
