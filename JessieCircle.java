package pa03;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.*;

public class JessieCircle extends CircleShape{
  public Color textColor;

  public JessieCircle(){
    super();
    this.color = new Color(217,242,255); //color: baby blues
    this.textColor=new Color(0,0,0);
  }
  public void draw( Graphics g ) {
    super.draw(g);
    Font helvetica = new Font("Helvetica",Font.PLAIN,(int)(radius));
    g.setFont(helvetica);
    g.setColor(textColor);
    g.drawString("Jessie",(int)(x-radius),(int)y);
  }

  public void keepOnBoard(){
    if (this.x < this.radius) {
      // it went off the left edge! do something!
      this.vx = 0;
      this.x = this.radius;

    }else if (this.x > CircleShape.boardWidth-this.radius) {
      // it went off the right edge! do something!
      this.vx = 0;
      this.x = CircleShape.boardWidth-this.radius;
    }

    if (this.y < this.radius){
      // it went above the top edge!
      this.vy = 0;
      this.y = this.radius;

    } else if (this.y > CircleShape.boardHeight-this.radius) {
      // it went below the bottom edge!
      this.vy = 0;
      this.y = CircleShape.boardHeight-this.radius;
    }
  }
}
