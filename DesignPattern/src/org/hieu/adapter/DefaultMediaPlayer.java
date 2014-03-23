package org.hieu.adapter;

public class DefaultMediaPlayer implements MediaPlayer {

	AdapterPlayer adapterPlayer;
	@Override
	public void play(String audioType, String fileName) {
		// TODO Auto-generated method stub
		if (audioType.equalsIgnoreCase("mp3")){
			System.out.println("Playing mp3 file. Name: "+ fileName);
		} else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
			adapterPlayer = new AdapterPlayer(audioType);
			adapterPlayer.play(audioType, fileName);
		} 
	}

}
