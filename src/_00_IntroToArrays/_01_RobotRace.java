package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		Robot[] robs = new Robot[5];
		
		for(int i = 0; i < robs.length; i++) {
			robs[i]=new Robot();
			robs[i].moveTo(50+(200*i), 550);
			robs[i].setSpeed(20);
		}
		
		
		while(robs[0].getY() >= 0 && robs[1].getY() >= 0 && robs[2].getY() >= 0 && robs[3].getY() >= 0 && robs[4].getY() >= 0) {
		for(int i = 0; i < robs.length; i++) {
			int random = new Random().nextInt(50);
			robs[i].move(random);
		}
		}
		
		int winner = 0;
		
		for(int i = 0; i < robs.length; i++) {
			if(robs[i].getY() <= 0) {
				winner = i;
			}
		}
		
		JOptionPane.showMessageDialog(null, "Congratulations! Robot #"+winner+" wins the race!");
		
		//2. create an array of 5 robots.
		
		//3. use a for loop to initialize the robots.

			//4. make each robot start at the bottom of the screen, side by side, facing up
	
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
    	
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

		//7. declare that robot the winner and throw it a party!
    	
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.

	}
}
