import java.util.Scanner;
public class soma {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        int N1, N2,soma;
         System.out.println("digite um número inteiro: ");
         N1 = Ler.nextInt();
         System.out.println("digite um número inteiro: ");
         N2 = Ler.nextInt();
         soma = N1+N2;
         System.out.println("A soma dos dois números é: "+soma);
    }
}