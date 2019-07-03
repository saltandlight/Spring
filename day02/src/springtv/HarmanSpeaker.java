package springtv;

import org.springframework.stereotype.Component;


public class HarmanSpeaker implements Speaker {

	@Override
	public void up() {
		System.out.println("Harman Speaker Volume Up");
	}

	@Override
	public void down() {
		System.out.println("Harman Speaker Volume Down");

	}

}
