package pa03;
import java.awt.Color;
public class SandyCircle extends CircleShape{
  private int cv=50;
  private int a=255;


  public SandyCircle(){
    super();

  }

  public void update(double dt){

    this.a += dt*cv;
    this.color=new Color(a%255,150,100,100);
    super.update(dt);
  }
}
