import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        String Nome, Cidade;

        System.out.println("Digite seu nome: ");
        Nome = Ler.nextLine();

        System.out.println("Digite a cidade que você mora: ");
        Cidade = Ler.nextLine();

        System.out.println("Olá " +Nome+", a cidade que você mora é "+Cidade+".");
        }
    }
