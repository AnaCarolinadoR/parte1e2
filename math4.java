import java.util.Scanner;

public class math4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double raio, area;
        System.out.print("Digite o raio do círculo: ");
        raio = scanner.nextDouble();
        area = Math.PI * Math.pow(raio, 2);
        System.out.println("A área do círculo é: " + area);

        System.out.print("Digite o raio do círculo: ");
        double ra,cir;
        ra = scanner.nextDouble();
        cir = 2 * Math.PI * raio;
        System.out.println("A circunferência do círculo é: " + cir);

        System.out.print("Digite o valor do primeiro cateto: ");
        double cat1,cat2,hip;
        cat1 = scanner.nextDouble();
        System.out.print("Digite o valor do segundo cateto: ");
        cat2 = scanner.nextDouble();
        hip = Math.sqrt(Math.pow(cat1, 2) + Math.pow(cat2, 2));
        System.out.println("A hipotenusa do triângulo retângulo é: " + hip);

        System.out.print("Digite o valor da base do retângulo: ");
        double base,alt,per;
        base = scanner.nextDouble();
        System.out.print("Digite o valor da altura do retângulo: ");
        alt = scanner.nextDouble();
        per = 2 * (base + alt);
        System.out.println("O perímetro do retângulo é de: " + per);

        System.out.print("Digite o valor da base do triângulo: ");
        double bas,at,ar;
        bas = scanner.nextDouble();
        System.out.print("Digite o valor da altura do triângulo: ");
        at = scanner.nextDouble();
        ar = (base * at) / 2;

        System.out.println("A área do triângulo é de: " + ar);
    }}
