package seance3;

public class Client implements Callback{
  public void callback(int p) {
    System.out.println(
      "Callback appélée avec " + p);
  }

  public void foo(){
    System.out.println("Foo...");
  }
}
