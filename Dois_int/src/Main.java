import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
      int N1,N2;
      System.out.println("Digite um número inteiro: ");
      N1 = Ler.nextInt();
      System.out.println("Digite um número inteiro: ");
      N2 = Ler.nextInt();

      System.out.println("Os números digitados foram "+N1+" e " +N2+".");
    }
}