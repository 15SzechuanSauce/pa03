package pa03;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.*;

public class xiaoyangCircle extends CircleShape{
  public Color textColor;

  public xiaoyangCircle(){
    super();
    this.color = new Color(200,0,0); //color:red
    this.textColor=new Color(0,0,0);
  }
  public void draw( Graphics g ) {
    super.draw(g);
    Font helvetica = new Font("Helvetica", Font.BOLD, 18);
    g.setFont(helvetica);
    g.setColor(textColor);
    g.drawString("YXY",(int)(x-radius),(int)y);
  }

  public void keepOnBoard(){
    if (this.x < this.radius) {
      // it went off the left edge! do something!
      this.vx = -this.vx;
      this.x = this.radius;
      this.textColor=new Color(102,178,255);


    }else if (this.x > CircleShape.boardWidth-this.radius) {
      // it went off the right edge! do something!
      this.vx = -this.vx;
      this.x = CircleShape.boardWidth-this.radius;
      this.textColor=new Color(0,153,76);
    }

    if (this.y < this.radius){
      // it went above the top edge!
      this.vy = -this.vy;
      this.y = this.radius;
      this.textColor=new Color(255,102,255);

    } else if (this.y > CircleShape.boardHeight-this.radius) {
      // it went below the bottom edge!
      this.vy = -this.vy;
      this.y = CircleShape.boardHeight-this.radius;
      this.textColor=new Color(204,102,0);
    }
  }

  public String toString(){
    return "xiaoyangCircle: "+super.toString();
  }
}
