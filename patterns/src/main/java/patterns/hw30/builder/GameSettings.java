package patterns.hw30.builder;

public class GameSettings {
    private int difficultyLevel;
    private boolean soundEnabled;

    public void setDifficultyLevel(int difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public void setSoundEnabled(boolean soundEnabled) {
        this.soundEnabled = soundEnabled;
    }

    public void setMusicEnabled(boolean musicEnabled) {
        this.musicEnabled = musicEnabled;
    }

    private boolean musicEnabled;

    private GameSettings(int difficultyLevel, boolean soundEnabled, boolean musicEnabled) {
        this.difficultyLevel = difficultyLevel;
        this.soundEnabled = soundEnabled;
        this.musicEnabled = musicEnabled;
    }
    private GameSettings(){

    }

    public int getDifficultyLevel() {
        return difficultyLevel;
    }

    public boolean isSoundEnabled() {
        return soundEnabled;
    }

    public boolean isMusicEnabled() {
        return musicEnabled;
    }

    public static class Builder {

        private GameSettings gameSettings;

        public Builder(){
            gameSettings = new GameSettings();
        }

        public Builder setDifficultyLevel(int difficultyLevel) {
            gameSettings.setDifficultyLevel(difficultyLevel);
            return this;
        }

        public Builder setSoundEnabled(boolean soundEnabled) {
            gameSettings.setSoundEnabled(soundEnabled);
            return this;
        }

        public Builder setMusicEnabled(boolean musicEnabled) {
            gameSettings.setMusicEnabled(musicEnabled);
            return this;
        }

        public GameSettings build() {
            return new GameSettings();
        }
    }
}

