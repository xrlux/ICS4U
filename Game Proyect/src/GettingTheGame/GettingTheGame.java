

package GettingTheGame;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.File;

import javax.imageio.ImageIO;
import javax.sound.sampled.*;


import hsa_new.Console;      
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

class GettingTheGame {

	public static void main(String[] args) {



		String y;
		String n;
		String answer;



		Console c = new Console(); 
		try {
			Clip music = AudioSystem.getClip();
			music.open(AudioSystem.getAudioInputStream(new File("audio/alarm_clock_converted.wav")));		
			Clip carcrash = AudioSystem.getClip();
			carcrash.open(AudioSystem.getAudioInputStream(new File("audio/car_crash.wav")));
			
			Clip traffic = AudioSystem.getClip();
			traffic.open(AudioSystem.getAudioInputStream(new File("audio/Traffic.wav")));
			
			Clip victory = AudioSystem.getClip();
			victory.open(AudioSystem.getAudioInputStream(new File("audio/victory.wav")));

			Clip siren = AudioSystem.getClip();
			siren.open(AudioSystem.getAudioInputStream(new File("audio/Policesiren.wav")));
			
			BufferedImage wakeLate = ImageIO.read(new File ("Img/wakeuplate.png"));
			BufferedImage crash = ImageIO.read(new File ("Img/carcrash.jpg"));
			BufferedImage gettingTheGame = ImageIO.read(new File ("Img/traffic.jpg"));	
			BufferedImage img2 = ImageIO.read(new File ("Img/leftoright.jpg"));
			BufferedImage parkingLot= ImageIO.read(new File ("Img/emptyparkinglot.jpg"));
			BufferedImage img = ImageIO.read(new File ("Img/alarmclock.png"));
			
			music.start();
			c.println("your alarm clock is ringing do you hit the snooze button?  (y/n)");
				c.drawImage (img, 0, 100, null); 
			answer = c.readLine();
			music.stop ();

			if (answer.equalsIgnoreCase("n")){
				c.println("you hear on the news that a video game has been released, you rush out to buy the game, do you drive pass the speed limit? (y/n)");

				answer=c.readLine();
				if (answer.equalsIgnoreCase("y")){
					c.drawImage (crash, 0, 100, null); 
					c.println("you crash");					
					carcrash.start();
					
				}
				else{ 
					c.println("do you want take the higway? (y/n)");
					answer = c.readLine();
					if ( answer.equalsIgnoreCase ("n")){
						c.drawImage (gettingTheGame, 0, 100, null); 
						c.println("there is traffic");
						traffic.start();
					
					}
					else if (answer.equalsIgnoreCase("y")){

						c.println("someone on the street offer the game do you buy it? (y/n)" );
						BufferedImage fakeGame = ImageIO.read(new File ("Img/fakegame.jpg"));
						answer = c.readLine();
						if ( answer.equalsIgnoreCase ("y")){
							c.println("you bought a fake copy of the game");
						}

						else if(answer.equalsIgnoreCase("n")){
							c.println("you finally arrive at the parking lot do you turn right?(y/n)");
							answer = c.readLine();
							if ( answer.equalsIgnoreCase ("y")){
								c.println("the parking lot on the right is packed");
								BufferedImage img3 = ImageIO.read(new File ("Img/fullparkinglot.jpg"));
								c.drawImage (img3, 0, 100, null); 
							}
							else if (answer.equalsIgnoreCase("n")){
								c.drawImage (parkingLot, 0, 100, null); 
								c.println("you parked your car and finally bought the game, you win!");
								victory.start();
							}
						}
					}

				}

			}else if(answer.equalsIgnoreCase("y")){
				c.println("you finally wake up and realize that a video game has been released, you rush out to buy the game do you drive over the speed limit? (y/n)");
				c.drawImage (wakeLate, 0, 100, null); 
				answer = c.readLine();
				if (answer.equalsIgnoreCase("y")){
					c.println("you got caught by the police");
					siren.start ();
				}
				else if (answer.equalsIgnoreCase("n")){
					c.println("your stomach grumbles as you become more hungry, you arrive at a resturant; do you eat up soup? (y/n)? ");{
						answer = c.readLine();
					}
					if (answer.equalsIgnoreCase("n")){
						c.println("you decided to eat a sandwich which had food poisioning and die ");
					}
					else if(answer.equalsIgnoreCase("y")){
						c.println("you decided to eat the soup which had laxatives and you take too long");
					}	
				}



			}


		}catch(Exception e) {
			System.err.println(e.getMessage());
		}

	}
}










