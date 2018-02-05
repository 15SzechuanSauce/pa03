package pa03;


import java.awt.Color;

public class VenusCircle extends CircleShape{

  public VenusCircle(){
    super();
    this.color = new Color(0,0,0);
  }

  public static void main(String[] args){
    VenusCircle x = new VenusCircle();
    System.out.println("my circle is "+x);
  }
  public String toString(){
    return "Venus's Circle: "+ super.toString();
  }
}
