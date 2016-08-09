package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	// 1. Create a new Robot
Robot bob = new Robot("vic");
Robot john = new Robot("vic");

	void go() {
		drawTriangle(100); // 3. delete this line (used only for testing)
bob.penDown();
		int i = 0;
		// 6. Make the robot go as fast as possible
bob.setSpeed(10);
		// 4. make a variable to hold the length of the triangle and set it to 50
int length = 50; 
		// 7. Do the following (up to step 10) 60 times
while (i<60){
			// 9. Change the color of the pen to a random color
bob.setRandomPenColor();	
			// 8. Increase the length of the side by 10 pixels
length=+10;	
			// 5. call your drawTriangle() method using your length variable
drawTriangle(200);
			// 10. Turn the tortoise 6 degrees to the right
bob.turn(1);
	
}
}



	/* 2. fill in the method below to draw a triangle. Use the length variable for the size of the triangle. */
	private void drawTriangle(int length) {
		bob.turn(360/3);
		bob.move(length);
		
		
	}}
	