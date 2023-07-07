import java.util.Scanner;

public class math3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double an,valor,tang,seno,cos,Artang,logNat;
        System.out.print("Digite um valor em radianos: ");

        an = scanner.nextDouble();
        valor = Math.toRadians(an);
        tang = Math.tan(valor);
        seno = Math.asin(valor);
        cos = Math.acos(valor);
        Artang = Math.atan(valor);
        logNat  = Math.log(valor);

        System.out.println("Tangente: " + tang);
        System.out.println("Arco Seno: " + seno);
        System.out.println("Arco Cosseno: " +cos);
        System.out.println("Arco tangente: " +Artang);
        System.out.println("Logaritmo natural: " + logNat);
    }
}
