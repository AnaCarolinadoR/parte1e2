import java.util.Scanner;
public class desconto {
    public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);
      double prodt,total;
      System.out.println("Digite o preço do seu produto: ");
      prodt = ler.nextDouble();
      total = prodt/100 * 90;
      System.out.println("O total com desconto foi de "+total);
    }
}
