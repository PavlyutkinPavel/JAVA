package patterns.hw31.adapter;

public class Main {
    public static void main(String[] args) {
        MediaPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("song.mp3");

        VideoPlayer videoPlayer = new VideoPlayerImpl();
        MediaPlayer videoAdapter = new VideoPlayerAdapter(videoPlayer);
        videoAdapter.play("movie.mp4");
    }
}
