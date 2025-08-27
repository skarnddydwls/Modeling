package _02_ocp;

public class SoundPlayer{

	private PlayInterface playInter;
	
	public void setPlayInter(PlayInterface playInter) {
		this.playInter = playInter;
	}
	
	public void play() {
		playInter.play();
	}
}
