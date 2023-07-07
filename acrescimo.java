import java.util.Scanner;
public class acrescimo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double num,total;
        System.out.println("Digite o valor do produto: ");
        num = ler.nextDouble();
        total = num/100 * 115;
        System.out.println("O valor do produto com acrescimo é de "+total);
    }
}
