package patterns.hw31.adapter;

class VideoPlayerImpl implements VideoPlayer {
    @Override
    public void playVideo(String filename) {
        System.out.println("Playing video: " + filename);
    }
}
