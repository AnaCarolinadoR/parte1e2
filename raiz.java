import java.util.*;
public class raiz {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double N1;
        System.out.print("Informe o valor desejado: ");
        N1 = ler.nextDouble();
        double raiz = Math.sqrt(N1);
        double elevado = Math.pow(N1,raiz);
        System.out.println("A raiz quadrada é: " +raiz);
        System.out.println("O número elevado a sua raiz é: "+elevado);
    }

    }