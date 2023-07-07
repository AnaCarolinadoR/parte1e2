import java.util.Scanner;
public class segundos {
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       double dia,hr,seg,diasg,hrseg,total;
       System.out.println("Digite os dias: ");
       dia = ler.nextDouble();
       System.out.println("Digite as horas: ");
       hr = ler.nextDouble();
       System.out.println("Digite os segundos: ");
       seg = ler.nextDouble();
       diasg = dia * 86400;
       hrseg = hr * 3600;
       total = diasg + hrseg + seg;
       System.out.println("O total de segundos é "+total);
    }
}
