package seance3;

  interface MethodeStatique {
  static int getDefaultNumber() {
    return 0;
  }
}

class ClasseConcrete implements MethodeStatique {}
