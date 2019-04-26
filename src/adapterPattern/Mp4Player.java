package adapterPattern;

public class Mp4Player implements AdvancedMediaPlayer{
	@Override
	public void playVlc(String fileName) {
		System.out.println("Could not play " + fileName + " VLC by Mp4Player");
	}
	
	@Override
	public void playMp4(String fileName){
		System.out.println("play " + fileName + " Mp4 by Mp4Player");
	}
}
