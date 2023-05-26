import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in); 

        System.out.print("Informe numero da sua conta: ");
        int numero = sc.nextInt();
        System.out.println();
        System.out.print("Informe o numero da agência: ");
        sc.nextLine();
        String agencia = sc.nextLine();
        System.out.print("Informe Seu nome: ");
        String nomeCliente = sc.nextLine();
        System.out.print("Informe seu Saldo: ");
        Double saldo = sc.nextDouble();

        System.out.println();
        System.out.println("'Olá "+ nomeCliente 
                                  + ", obrigado por criar uma conta em nosso banco, sua agência é "
                                  + agencia 
                                  +", conta " 
                                  + numero
                                  +" e seu saldo "
                                  + saldo
                                  + " já está disponível para saque.'");       

        sc.close();
    }
}
