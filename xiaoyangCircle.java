package pa03;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.*;



public class xiaoyangCircle extends CircleShape{
  public Color borderColor;
  public Color textColor;

  public xiaoyangCircle(){
    super();
    this.color = new Color(200,0,0); //color:red
    this.borderColor=new Color(200,0,0);
  }
  public void draw( Graphics g ) {
    //super.draw(g);
    int u = (int)(x-radius);
    int v = (int)(y-radius);
    int w = (int)(2*radius);
    int h = w;
    g.setColor( color );
    g.fillOval( u,v,w,h );
    g.setColor( borderColor);
    g.drawOval(u,v,w,h );
    Font helvetica = new Font("Helvetica", Font.PLAIN, 18);
    g.setFont(helvetica);
    this.textColor=new Color(0,0,0);
    g.setColor(textColor);
    g.drawString("YXY",(int)x,(int)y);

  }

  public String toString(){
    return "xiaoyangCircle: "+super.toString();
  }
}
