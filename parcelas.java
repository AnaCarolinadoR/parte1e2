import java.util.Scanner;

public class parcelas {
    public static void main(String[] args) {
        double valor, parc, total;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor do produto: ");
        valor = ler.nextDouble();
        System.out.println("Digite a quantidade de parcelas desejada: ");
        parc = ler.nextDouble();
        total = valor / parc;

        System.out.println("O valor das parcelas é de " + total);

    }}