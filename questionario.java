import java.util.Scanner;
public class questionario {
    public static void main(String[] args) {
      Scanner Ler = new Scanner(System.in);
      String nome,rua,cidade,estado ;
      double cep,numRua,numTel,cpf;

      System.out.println("Digite seu nome: ");
      nome = Ler.nextLine();
      System.out.println("Digite sua rua: ");
      rua = Ler.nextLine();
      System.out.println("Digite sua cidade: ");
      cidade = Ler.nextLine();
      System.out.println("Digite seu estado: ");
      estado = Ler.nextLine();
      System.out.println("Digite o número de sua casa: ");
      numRua = Ler.nextDouble();
      System.out.println("Digite seu CEP: ");
      cep = Ler.nextDouble();
      System.out.println("Digite seu número de telefone: ");
      numTel = Ler.nextDouble();
      System.out.println("Digite seu CPF");
      cpf = Ler.nextDouble();

     System.out.println(" Nome:" +nome);
     System.out.println(" Endereço: RUA "+rua+", NUMERO: " +numRua+",CEP: "+cep);
     System.out.println(" Cidade: "+cidade);
     System.out.println(" Estado: "+estado);
     System.out.println(" CPF: "+cpf);
     System.out.println(" Tel. Celular: (48)"+numTel);

    }
}
