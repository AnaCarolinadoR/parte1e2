
import java.util.Scanner;
public class imc1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double peso, alt, imc, altura;
        System.out.println("Digite seu peso: ");
        peso = ler.nextDouble();
        System.out.println("Digite sua altura: ");
        alt = ler.nextDouble();
        altura = alt * alt;
        imc = peso / altura;
        System.out.println("Seu IMC é de " + imc);
    }
}
