package adapterPattern;

public class AdapterPatternDemo {

	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();
		audioPlayer.play("mp3", "abc");
		audioPlayer.play("mp4", "abc.mp4");
		audioPlayer.play("vlc", "abc.vlc");
		audioPlayer.play("avi", "abc.avi");
	}

}
