package org.hieu.adapter;

public class AdapterPlayer implements MediaPlayer {

	AdvanceMediaPlayer advanceMediaPlayer;
	
	public AdapterPlayer(String audioType){
		if (audioType.equalsIgnoreCase("vlc")){
			advanceMediaPlayer = new VlcPlayer();
		} else if (audioType.equalsIgnoreCase("mp4")){
			advanceMediaPlayer = new Mp4Player();
		}
	}
	@Override
	public void play(String audioType, String fileName) {
		// TODO Auto-generated method stub
		if (audioType.equalsIgnoreCase("vlc")){
			advanceMediaPlayer.playVlc(fileName);
		} else if (audioType.equalsIgnoreCase("mp4")){
			advanceMediaPlayer.playMp4(fileName);
		}
	}

}
