public class Patolino extends Duck{

  public Patolino (FlyBehavior flyBehavior, QuackBehavior quackBehavior){
    super (flyBehavior, quackBehavior);
  }

  @Override
  public void display() {
    System.out.println("Eu sou o Patolino");    
  }
}
