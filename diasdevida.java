import java.util.Scanner;

public class diasdevida {
    public static void main(String[] args) {
        int meses,idade,diasano,diasmes,total;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        idade = ler.nextInt();
        System.out.println("Digite sua idade em meses ex:16 anos e 4 meses:  ");
        meses  = ler.nextInt();
        diasano = idade * 365;
        diasmes = meses * 31;
        total = diasano+diasmes;
        System.out.println("O número aproximado dos seus dias vividos são: " +total);

    }}