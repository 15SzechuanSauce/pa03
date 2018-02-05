package pa03;

<<<<<<< HEAD
public class VenusCircle extends CircleShape{

=======
import java.awt.Color;

public class VenusCircle extends CircleShape{

  public VenusCircle(){
    super();
    this.color = new Color(0,0,0);
  }
  
>>>>>>> a300a4004d30fd6ca2f81313b53ea17c08215b80
  public static void main(String[] args){
    VenusCircle x = new VenusCircle();
    System.out.println("my circle is "+x);
  }
  public String toString(){
    return "Venus's Circle: "+ super.toString();
  }
}
