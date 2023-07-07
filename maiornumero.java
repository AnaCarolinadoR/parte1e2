import java.util.Scanner;
public class maiornumero {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double N1,N2;
        System.out.println("Digite um número: ");
        N1 = ler.nextDouble();
        System.out.println("Digite um número: ");
        N2 = ler.nextDouble();

        if(N1>N2) {
            ;
            System.out.println("O maior número digitado é: " + N1);
        }else{
            System.out.println("O maior número digitado é: "+N2);
        }
    }
}