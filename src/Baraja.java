
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
      Carta unaCarta=new Carta();
      Random miRandom=new Random();
      int p1= miRandom.nextInt(12);
      int p11 = miRandom.nextInt(12);
      unaCarta.número = números[p1];
      números[p1] =  números[p11];
      números[p11] = unaCarta.número;
      Carta unaCarta2=new Carta();
      Random miRandom2=new Random();
      int p2= miRandom2.nextInt(3);
      int p21 = miRandom2.nextInt(3);
      unaCarta.palo = palos[p2];
      números[p2] =  palos[p21];
      números[p21] = unaCarta2.palo;      
  }
}

   

        
        
    

