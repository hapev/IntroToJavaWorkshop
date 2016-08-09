package day1.robot;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class intro {
public static void main(String[] args) {
Robot Bob = new Robot();
Bob.penDown();

while (0==0){

Bob.setPenColor(new Random().nextInt(256),new Random().nextInt(256),new Random().nextInt(256));
Bob.turn(new Random().nextInt(360));
Bob.move(new Random().nextInt(500));

}


}








}
