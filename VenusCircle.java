package pa03;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.*;

public class VenusCircle extends CircleShape{
  public String word = "";

  public VenusCircle(){
    super();
    this.color = new Color(255,255,255); 
  }

  public void draw( Graphics g ){
    super.draw(g);
    Font helvetica = new Font("Helvetica",Font.PLAIN,(int)(radius));
    g.setFont(helvetica);
    g.setColor(Color.BLACK);
    g.drawString(word,(int)(x-radius),(int)y);
  }

  public void keepOnBoard(){
    if (this.x < this.radius) {
      // it went off the left edge! do something!
      this.vx = -this.vx;
      this.x = this.radius;
      this.color = new Color(176,124,218);
      word = "duang";
    }else if (this.x > CircleShape.boardWidth-this.radius) {
      // it went off the right edge! do something!
      this.vx = -this.vx;
      this.x = CircleShape.boardWidth-this.radius;
      this.color = new Color(107,167,214);
      word = "boom";
    }
    if (this.y < this.radius){
      // it went above the top edge!
      this.vy = -this.vy;
      this.y = this.radius;
      this.color = new Color(100,212,199);
      word = "biu";
    } else if (this.y > CircleShape.boardHeight-this.radius) {
      // it went below the bottom edge!
      this.vy = -this.vy;
      this.y = CircleShape.boardHeight-this.radius;
      this.color = new Color(255,132,188);
      word = "bang";
    }
  }
}
