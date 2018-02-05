package pa03;

import java.awt.Color;

public class xiaoyangCircle extends CircleShape{

  public xiaoyangCircle(){
    super();
    this.color = new Color(0,0,0);
  }

  public static void main(String[] args) {
    xiaoyangCircle x = new xiaoyangCircle();
    System.out.println("my circle is "+x);
  }

  public String toString(){
    return "xiaoyangCircle: "+super.toString();
  }
}
