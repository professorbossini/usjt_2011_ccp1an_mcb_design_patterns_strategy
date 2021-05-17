import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Principal {
  public static void main(String[] args) throws InterruptedException {
    Random gerador = new Random();
    List <Duck> patos = new ArrayList<Duck>();
    patos.add(new Donald (new FlyWithWings(), new CommonQuackBehavior()));
    patos.add(new MallardDuck(new FlyWithWings(), new CommonQuackBehavior()));
    patos.add(new Patolino(new FlyNoWay(), new CommonQuackBehavior()));
    patos.add(new RedHeadDuck(new FlyWithWings(), new CommonQuackBehavior()));
    patos.add(new RubberDuck(new FlyNoWay(), new SqueakQuackBehavior()));

    while (true){
      for (Duck pato : patos){
        double probabilidade = gerador.nextDouble();
        if (probabilidade <= 0.5)
          pato.setFlyBehavior(new RocketPoweredFlyBehavior());
        pato.display();
        pato.flyBehavior.fly();
        pato.quackBehavior.quack();
        System.out.println("-------------------------------------------------");
      }
      System.out.println ("============================================");
      Thread.sleep(5000);
    }

  }
}
