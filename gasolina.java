import java.util.Scanner;
public class gasolina {
    public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);
      double litro,valor,total;
      System.out.println("Digite a quantidade de litros de gasolina: ");
      litro = ler.nextDouble();
      System.out.println("Digite o preço do litro da gasolina: ");
      valor = ler.nextDouble();
      total = valor * litro;
      System.out.println("O preço total da gasolina ficou em "+total);
    }
}
