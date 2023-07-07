import java.util.Scanner;
public class horasdetrabalho {
    public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);
      double hora,htraba,salario;
      System.out.println("Digite as horas trabalhadas: ");
      hora = ler.nextDouble();
      System.out.println("Digite o quanto ganha por hora: ");
      htraba = ler.nextDouble();
      salario = hora * htraba;
      System.out.println("O salário diário é de "+salario);
    }
}