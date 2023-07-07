import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner Ler = new Scanner(System.in);
      int Idade;

      System.out.println("Digite sua idade: ");
      Idade = Ler.nextByte();

      System.out.println("Sua idade é de "+Idade+" anos.");
    }
}