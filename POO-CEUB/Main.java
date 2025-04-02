import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite o peso: ");
        double peso = sc.nextDouble();
        sc.nextLine();

        System.out.print("Digite a altura: ");
        double altura = sc.nextDouble();
        sc.nextLine();

        Pessoa pessoa = new Pessoa(nome, peso, altura);

        pessoa.mostrarImcAnalisePessoa();


        sc.close();

        

        
    }
}