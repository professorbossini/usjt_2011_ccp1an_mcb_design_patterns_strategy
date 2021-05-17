public class RedHeadDuck extends Duck {
  public RedHeadDuck (FlyBehavior flyBehavior, QuackBehavior quackBehavior){
    super (flyBehavior, quackBehavior);
  }
  @Override
  public void display() {
    System.out.println("Sou um RedHeadDuck");    
  }  
}
