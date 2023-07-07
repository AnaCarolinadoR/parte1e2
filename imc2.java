import java.util.Scanner;
public class imc2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double peso, alt, imc;
        System.out.println("Digite seu peso: ");
        peso = ler.nextDouble();
        System.out.println("Digite sua altura: ");
        alt = ler.nextDouble();

        imc = peso / (alt * alt);
        System.out.println("Seu IMC é de " + imc);
    }
}