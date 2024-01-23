package seance3;

interface InterfaceA {
  default void afficher() {
      System.out.println("InterfaceA");
  }
}

interface InterfaceB {
  default void afficher() {
      System.out.println("InterfaceB");
  }
}

public class ClasseConcrete implements InterfaceA, InterfaceB {
  @Override
  public void afficher() {
      InterfaceA.super.afficher();  // Chosissnat l'InterfaceA
      // ou
      // InterfaceB.super.afficher();  // Chosissnat l'InterfaceB
  }
}
