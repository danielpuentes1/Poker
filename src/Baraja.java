
import java.util.Random;

public class Baraja {
 String palos[] = { "trébol", "picas", "diamantes", "corazón" };  
 String números[] = {"As" , "2" , "3" , "4" , "5" , "6" , "7" ,"8","9","10","J","Q","K"};

Carta miCarta[][] = new Carta[13][4];
  void crearBaraja(){  
for (int i = 0 ; i < 13 ; i++){
    for (int j = 0; j < 4; j++) {
        miCarta[i][j] = new Carta();
        miCarta[i][j].número= números[i];
        miCarta[i][j].palo = palos[j];
        
    }
    }
   }
  void barajarCartas(){
      for (int i = 0 ; i < 13 ; i++){
    for (int j = 0; j < 4; j++) {
        miCarta[i][j] = new Carta();
        miCarta[i][j].número= números[revolver.toString(i)];
        miCarta[i][j].palo = palos[j];
        
      
  }
}

   

        
        
    

