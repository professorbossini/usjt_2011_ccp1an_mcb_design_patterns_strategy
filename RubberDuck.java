public class RubberDuck extends Duck{
  public RubberDuck (FlyBehavior flybehavior, QuackBehavior quackBehavior){
    super(flybehavior, quackBehavior);
  }
  @Override
  public void display() {
    System.out.println("Sou um Rubber Duck");    
  }

  // @Override
  // public void quack() {
  //   System.out.println("Squeak");
  // }

  // @Override
  // public void fly() {
    
  // }
}
