import java.util.Scanner;

public class anonascimento {
    public static void main(String[] args) {
       int ano,idade, anonas;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        idade = ler.nextInt();
        System.out.println("Digite o ano em que estamos : ");
        ano  = ler.nextInt();
        anonas = ano - idade;

        System.out.println("O ano de seu nascimento foi: " + anonas);

    }}