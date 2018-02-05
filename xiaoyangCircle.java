package pa03;

public class xiaoyangCircle extends CircleShape{

  public static void main(String[] args) {
    xiaoyangCircle x = new xiaoyangCircle();
    System.out.println("my circle is "+x);
  }

  public String toString(){
    return "xiaoyangCircle: "+super.toString();
  }
}
