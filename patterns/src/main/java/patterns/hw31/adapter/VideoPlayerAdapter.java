package patterns.hw31.adapter;

public class VideoPlayerAdapter implements MediaPlayer {
    private VideoPlayer videoPlayer;

    public VideoPlayerAdapter(VideoPlayer videoPlayer) {
        this.videoPlayer = videoPlayer;
    }

    @Override
    public void play(String filename) {
        videoPlayer.playVideo(filename);
    }
}
