import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner Ler = new Scanner(System.in);
      String Nome,Rua,cidade,Estado ;
      double Cep,Numrua,Numtel,Cpf;

      System.out.println("Digite seu nome: ");
      Nome = Ler.nextLine();
      System.out.println("Digite sua rua: ");
      Rua = Ler.nextLine();
      System.out.println("Digite sua cidade: ");
      cidade = Ler.nextLine();
      System.out.println("Digite seu estado: ");
      Estado = Ler.nextLine();
      System.out.println("Digite o número de sua casa: ");
      Numrua = Ler.nextDouble();
      System.out.println("Digite seu CEP: ");
      Cep = Ler.nextDouble();
      System.out.println("Digite seu número de telefone: ");
      Numtel = Ler.nextDouble();
      System.out.println("Digite seu CPF");
      Cpf = Ler.nextDouble();

     System.out.println(" Nome:" +Nome);
     System.out.println(" Endereço: RUA "+Rua+", NUMERO: " +Numrua+",CEP: "+Cep);
     System.out.println(" Cidade: "+cidade);
     System.out.println(" Estado: "+Estado);
     System.out.println(" CPF: "+Cpf);
     System.out.println(" Tel. Celular: (48)"+Numtel);

    }
}