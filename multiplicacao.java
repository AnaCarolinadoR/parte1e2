import java.util.Scanner;
public class multiplicacao {
    public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);
      int N1,N2,mult;
      System.out.println("Digite um número inteiro: ");
      N1= ler.nextInt();
      System.out.println("Digite um número inteiro: ");
      N2= ler.nextInt();
      mult = N1 * N2;
      System.out.println("O resultado da multiplicação é "+mult);
    }
}
