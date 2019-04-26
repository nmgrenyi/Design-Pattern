package adapterPattern;

public class VlcPlayer implements AdvancedMediaPlayer {
	@Override
	public void playVlc(String fileName) {
		System.out.println("play " + fileName + " VLC from VlcPlayer");
	}
	
	@Override
	public void playMp4(String fileName){
		System.out.println("Could not play "+ fileName + " Mp4 by VlpPlayer");
	}
}
