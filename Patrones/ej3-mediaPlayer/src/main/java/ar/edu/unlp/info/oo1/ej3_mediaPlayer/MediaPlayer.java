package ar.edu.unlp.info.oo1.ej3_mediaPlayer;

import java.util.ArrayList;
import java.util.List;

public class MediaPlayer {
	private List<Media> media;
	
	public MediaPlayer() {
		this.media = new ArrayList<MediaPlayer>();
	}
	
	public void play() {
		this.media.stream()
		.forEach(media -> media.play());
	}
	
	
}
