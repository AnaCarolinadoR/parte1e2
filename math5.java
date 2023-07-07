import java.util.Scanner;

public class math5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double catadj,catop,hip;
        System.out.print("Digite o valor do cateto adjacente: ");
        catadj= scanner.nextDouble();
        System.out.print("Digite o valor do cateto oposto: ");
        catop = scanner.nextDouble();
        hip = Math.sqrt(Math.pow(catadj, 2) + Math.pow(catop, 2));

        System.out.println("A hipotenusa do triângulo é: " + hip);
    }
}