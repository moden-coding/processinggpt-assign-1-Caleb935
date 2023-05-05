import processing.core.*;

public class App extends PApplet {
    public static void main(String[] args)  {
        PApplet.main("App");
    }
      public void settings() {
        size(400, 400);
    }
    public void setup() {
        background(0, 255, 0);
    }
    public void draw() {
        //Rectangle
        stroke(86, 235 ,121);
        strokeWeight(10);
        fill(0, 111, 2);
        rect(175, 150, 50, 100);
       
        //Oval
        fill(255,30, 25);
        stroke(55, 0 ,28);
        strokeWeight(3);
        ellipse(200, 200, 10, 30);

        //line
        fill(255, 0, 0);
        stroke(89,76 ,150);
        strokeWeight(2);
        line(200, 150, 200, 250);


    }
}
