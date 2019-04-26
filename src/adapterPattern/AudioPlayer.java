package adapterPattern;

public class AudioPlayer implements MediaPlayer{
	MediaAdapter mediaAdaptor;
	public void play(String format, String name) {
		System.out.println("play audio");
		if (format.equals("mp3")) {
			System.out.println("Playing mp3 file. Name: " + name);
		}
		else if (format.equals("mp4") || format.equals("vlc")) {
			mediaAdaptor = new MediaAdapter(format);
			mediaAdaptor.play(format, name);
		}
	}
}
