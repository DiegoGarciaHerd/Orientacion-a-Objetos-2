package ar.edu.unlp.info.oo1.ej3_mediaPlayer;

public class VideoStreamAdapter extends Media {
	private VideoStream videoStream;
	
	public void play() {
		videoStream.reproduce();
	}
}
