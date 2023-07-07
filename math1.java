
import java.util.Scanner;
public class math1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double N1, N2, N3, N4, parte1, parte2, dist;
        System.out.print("Digite as cordenadas do primeiro ponto: ");
        N1 = scanner.nextDouble();
        N2 = scanner.nextDouble();
        System.out.print("Digite as coordenadas do segundo ponto: ");
        N3 = scanner.nextDouble();
        N4 = scanner.nextDouble();
        parte1 = Math.pow(N2 - N1, 2);
        parte2 = Math.pow(N3 - N4, 2);
        dist = Math.sqrt(parte1 + parte2);

        System.out.println("A distância entre os pontos é de: " + dist);
    }
}
