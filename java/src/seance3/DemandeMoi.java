package seance3;

interface Constantes {
  int NO = 0;
  int MAYBE = 1;
  int YES = 2;
}

class Question implements Constantes {
  int demander(int value) {
    if (value < 30)
      return NO;
    else if (value < 60)
      return MAYBE;
    else 
      return YES;
  }
}

public class DemandeMoi implements Constantes {
  void repondre(int resultat) {
    switch(resultat) {
      case NO:
        System.out.println("No...");
        break;
      case MAYBE:
        System.out.println("Maybe.");
        break;
      case YES:
        System.out.println("Yes !");
        break;
    }
  }
}