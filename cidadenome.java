import java.util.Scanner;
public class cidadenome {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        String Nome, Cidade;
        int Idade;

        System.out.println("Digite seu nome: ");
        Nome = Ler.next();
        System.out.println("Digite sua idade: ");
        Idade = Ler.nextInt();

        System.out.println("Digite a cidade que você mora: ");
        Cidade = Ler.next();

        System.out.println("Olá " +Nome+",você tem " +Idade+ " a cidade que você mora é "+Cidade+".");
    }
}