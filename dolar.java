import java.util.Scanner;
public class dolar {
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       double reais,total;
       System.out.println("Digite o valor em reais: ");
       reais = ler.nextDouble();
       total = reais * 4.93;
       System.out.println("O valor de reais convertido para dólar ficou em: "+total);
    }
}
