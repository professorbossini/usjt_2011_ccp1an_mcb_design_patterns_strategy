public abstract class Duck {

  FlyBehavior flyBehavior;
  QuackBehavior quackBehavior;

  public Duck (FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
    this.flyBehavior = flyBehavior;
    this.quackBehavior = quackBehavior;
  }

  public void setFlyBehavior(FlyBehavior flyBehavior){
    this.flyBehavior = flyBehavior;
  }

  public void setQuackBehavior(QuackBehavior quackBehavior) {
    this.quackBehavior = quackBehavior;
  }

  public  void swim(){
    System.out.println("Pato nadando...");
  }
  public abstract void display();
  
  // public void fly (){
  //   System.out.println ("Pato voando...");
  // }
  // public  void quack(){
  //   System.out.println("Quack");
  // }
}
