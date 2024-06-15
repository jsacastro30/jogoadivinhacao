// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;
import java.util.Random;
public class Main {
  public static void main(String[] args) {

    Random gerador = new Random();
    int x = gerador.nextInt(100);

    Scanner entrada = new Scanner(System.in);
    System.out.println("Adivinhe o número que estou pensando ");
    int numero = entrada.nextInt();
    
    if(numero == x){
      System.out.println("Parabéns, você acertou, o numero é " + x + " !");
      
    }
    else {
      System.out.println("Você errou, o numero é " + x + "!");
      
    }

    
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}