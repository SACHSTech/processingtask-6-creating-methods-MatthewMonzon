import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(135, 206, 235);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  drawGround(1, 1, 86, 125, 70);
    drawHouse(1, 1, 203, 65, 84, 150, 75, 0, 172, 140, 24, 135, 206, 235, 0, 0, 128);
    drawSun(200, 25, 250, 225, 0, 50, 50);
    System.out.print(drawSun(200, 25, 250, 225, 0, 50, 50));
  }
  
  // create method for ground
  public void drawGround(float groundX, float groundY, float groundR, float groundG, float groundB) {
    stroke(0);
    fill(groundR, groundG, groundB);
    rect(groundX * 0, groundY * 350, groundX * 400, groundY * 50);
  
  }
  //create method for house
  public void drawHouse(float houseX, float houseY, float brickR, float brickG, float brickB, float doorR, float doorG, float doorB, float knobR, float knobG, float knobB, float windowR, float windowG, float windowB, float roofR, float roofG, float roofB) {
    fill(brickR, brickG, brickB);
    rect(houseX * 175, houseY * 150, houseX * 200, houseY * 200);
    //door
    fill(doorR, doorG, doorB);
    rect(houseX * 225, houseY * 225, houseX * 50, houseY * 125);
    //knob
    fill(knobR, knobG, knobB);
    ellipse(houseX * 260, houseY * 300, houseX * 10, houseY * 10);
    // window
    fill(windowR, windowG, windowB);
    rect(houseX * 300, houseY * 225, houseX * 50, houseY *50);
    line(325, 225, 325, 275);
    line(300, 250, 350, 250);
    // roof
    fill(roofR, roofG, roofB);
    triangle(houseX * 150, houseY * 150, houseX * 275, houseY * 50, houseX * 400, houseY * 150);

  }
   // create method for sun
   public int drawSun(float sunX, float sunY, float sunR, float sunG, float sunB, float sunSizeX, float sunSizeY) {

    stroke(0);
    fill(sunR, sunG, sunB);
    ellipse(sunX, sunY, sunSizeX, sunSizeY);

    line(sunX - 50, sunY, sunX - 30, sunY);
    line(sunX + 30, sunY, sunX + 50, sunY);
    line(sunX - 50, sunY + 25, sunX - 30, sunY + 15);
    line(sunX + 30, sunY + 15, sunX + 50, sunY + 25);
    line(sunX - 50, sunY - 20, sunX - 30, sunY - 15);
    line(sunX + 30, sunY - 15, sunX + 50, sunY - 20);

    return (int) sunX;
  }
}