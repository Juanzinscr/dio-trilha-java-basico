import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe scanner
        
        Scanner sc = new Scanner(System.in);

        //Exibir as mensagens para o nosso usuário
        System.out.println("Olá, Seja Bem-vindo!");

        //Obter pela classe scanner os valores digitados no terminal

        System.out.println("Digite o número da sua conta: ");
        int numero = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite qual a sua agência: ");
        String agencia = sc.nextLine();

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Informe o saldo da sua conta: ");
        float saldo = sc.nextFloat();
        sc.nextLine();

        //Exibir a mensagem Conta Criada
        System.out.println("\nConta Criada Com Sucesso!\n");
        System.out.printf("Cliente: %s\nNúmero da conta: %d\nAgência: %s\nSaldo: %.2f\n", nome, numero, agencia, saldo);

        sc.close();
    }   
}
