package org.hieu.adapter;

public class AdapterPatternDemo {
public static void main(String args[]) {
	DefaultMediaPlayer defMedPlayer = new DefaultMediaPlayer();
	defMedPlayer.play("mp3", "beyond the horizon.mp3");
	defMedPlayer.play("mp4", "alone.mp4");
	defMedPlayer.play("vlc", "far far away.vlc");
	defMedPlayer.play("avi", "mind me.avi");
}
}
