package seance3;

interface MethodePrivee {
  private int foo() {
    return 10;
  }

  default void bar() {
    System.out.println(foo());
  }
}
