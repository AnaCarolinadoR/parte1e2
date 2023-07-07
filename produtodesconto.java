import java.util.Scanner;

public class produtodesconto {
    public static void main(String[] args) {
        double valor,porc,total,valpro;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor do produto: ");
        valor = ler.nextDouble();
        System.out.println("Digite a porcentagem do desconto: ");
        porc = ler.nextDouble();
        total = porc/100 * valor;
        valpro = valor - total;
        System.out.println("O valor do produto com desconto ficou: "+valpro);


    }
}
