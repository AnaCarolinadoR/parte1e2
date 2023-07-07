import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner Ler = new Scanner(System.in);
      int N1,N2;


      System.out.println("Digite o primeiro número:");
      N1 = Ler.nextInt();
      System.out.println("Digite o segundo número:");
      N2 = Ler.nextInt();

      N1=N1 ^ N2;
      N2=N1 ^ N2;
      N1=N1 ^ N2;

      System.out.println("O primeiro número é "+N1+" e o segundo número é "+N2);


    }
}