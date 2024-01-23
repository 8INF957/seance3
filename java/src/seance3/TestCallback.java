package seance3;

public class TestCallback {
  public static void main(String[] args) {
    Callback c = new Client();
    c.callback(30);
    c.foo();
  }
}
