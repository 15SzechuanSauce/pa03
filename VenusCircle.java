package pa03;

import java.awt.Color;
import java.awt.Graphics;

public class VenusCircle extends CircleShape{

  public VenusCircle(){
    super();
    this.color = new Color(217,242,255); //color: baby blues
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
