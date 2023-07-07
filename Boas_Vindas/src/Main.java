import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner Ler = new Scanner(System.in);

        String Nome;

        System.out.println("Digite seu nome: ");
        Nome = Ler.next();

        System.out.println("BEM VINDO(A) " +Nome+"!");

    }
}