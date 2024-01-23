package seance3;

interface Vehicule {
  default void demarrer() {
    System.out.println("Vehicule en marche");
  }
}

class Voiture implements Vehicule {
  // Voiture hérite de la méthode demarrer() par défaut
}

class Moto implements Vehicule {
  @Override
  public void demarrer() {
    System.out.println("Moto en marche");
  }
}