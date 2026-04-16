package com.interfaces;

interface Camera  {
	void takePicture();
}
interface MusicPlayer {
	void playSong();
}

class Phone implements Camera,MusicPlayer {
	public void takePicture() {
		System.out.println("Picture Taken");
	}
	public void playSong() {
		System.out.println("Playing");
	}
}



public class Test1 {

	public static void main(String[] args) {
		Phone p=new Phone();
		p.takePicture();
		p.playSong();

	}

}
