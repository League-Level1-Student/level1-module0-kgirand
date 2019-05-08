package houses;
import java.awt.Color;
import java.util.Set;
import javax.swing.JFrame;
import org.jointheleague.graphical.robot.Robot;

public class houses {
static Robot rob = new Robot();
static int small =  60;
static int medium = 120;
static int large = 250;
static Color pink = Color.PINK;
static Color green = Color.GREEN;
static Color blue = Color.BLUE;
static Color black = Color.BLACK;
public static void main(String[] args) {

rob.setSpeed(100);
rob.setX(50);
rob.setY(400);
rob.penDown();
for(int i = 0; i<4; i++) {
drawHouseSmall();	
drawHouseLarge();
drawHouseMedium();
}
}
public static void drawHouseSmall() {
rob.setPenColor(Color.pink);
rob.move(small);
rob.turn(45);
rob.move(15);
rob.turn(90);
rob.move(15);
rob.turn(45);
rob.move(small);
rob.turn(-90);
rob.setPenColor(green);
rob.move(50);
rob.turn(-90);
}
public static void drawHouseMedium() {
rob.setPenColor(blue);
rob.move(medium);
rob.turn(90);
rob.move(25);
rob.turn(90);
rob.move(medium);
rob.turn(-90);
rob.setPenColor(green);
rob.move(50);
rob.turn(-90);
}
public static void drawHouseLarge() {
rob.setPenColor(black);
rob.move(large);
rob.turn(90);
rob.move(25);
rob.turn(90);
rob.move(large);
rob.turn(-90);
rob.setPenColor(green);
rob.move(50);
rob.turn(-90);
}

}
