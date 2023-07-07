import java.util.Scanner;
public class areacirculo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
         double raio,diam,area;

         System.out.println("Digite o raio do circulo: ");
         raio = ler.nextDouble();
         diam = raio * raio;
         area = 3.14 * diam;
         System.out.println("A área do circulo é de: "+area);

    }
}
