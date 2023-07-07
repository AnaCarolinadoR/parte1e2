import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        int N1;
        double N2;
        System.out.println("Digite um número inteiro: ");
        N1 = Ler.nextInt();
        System.out.println("Digite um número decimal: ");
        N2 = Ler.nextDouble();

        System.out.println("Os números digitados foram " + N1 + " e " + N2 + ".");
    }
}
