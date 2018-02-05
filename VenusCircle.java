package pa03;

public class VenusCircle extends CircleShape{

  public static void main(String[] args){
    VenusCircle x = new VenusCircle();
    System.out.println("my circle is "+x);
  }
  public String toString(){
    return "Venus's Circle: "+ super.toString();
  }
}
