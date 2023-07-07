import java.util.Scanner;
public class areaquadrado {
    public static void main(String[] args) {
       double lado,area;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o lado do quadrado: ");
        lado = ler.nextDouble();
        area  = lado * lado;
        System.out.println("A área do quadrado é de " +area);

    }
}
