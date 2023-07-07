import java.util.Scanner;
public class carro {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double dias,valor,total;
        System.out.println("Digite quantos dias o carro foi alugado: ");
        dias = ler.nextDouble();
        System.out.println("Digite o preço da diaria: ");
        valor = ler.nextDouble();
        total = valor * dias;
        System.out.println("O preço total dos dias alugados ficou em "+total);
    }
}
