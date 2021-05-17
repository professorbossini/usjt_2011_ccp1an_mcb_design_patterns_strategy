public class Donald extends Duck{

  public Donald (FlyBehavior flyBehavior, QuackBehavior quackBehavior){
    super (flyBehavior, quackBehavior);
  }
  @Override
  public void display() {
    System.out.println ("Pato Donald");    
  }
}
