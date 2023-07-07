import java.util.*;
public class math2 {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
    double N1,N2,arrdc,arredb,ale,abs,max,min,ang,res,cos;
    System.out.println("Digite um número: ");
    N1 = ler.nextDouble();
    System.out.println("Digite um número: ");
    N2 = ler.nextDouble();
    arrdc = Math.ceil(N1);
    arredb = Math.floor(N1);
    ale = Math.random();
    abs = Math.abs(N1);
    max = Math.max(N1,N2);
    min = Math.min(N1,N2);
    ang = Math.toRadians(N1);
    res= Math.sin(ang);
    cos = Math.cos(N1);
    System.out.println("O número arredondado para cima ficou: "+arrdc);
    System.out.println("O número arredondado para baixo ficou: "+arredb);
    System.out.println("Um número aleatorio: "+ale);
    System.out.println("O valor absoluto é: "+abs);
    System.out.println("O máximo dos dois números é de: "+max);
    System.out.println("O minimo dos dois números é de: "+min);
    System.out.println("O seno do ângulo é: "+res);
    System.out.println("O cosseno do ângulo é: "+cos);


    }
}
