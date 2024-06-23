package sistema;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        dominio.Banco banco = new dominio.Banco();
        Scanner sc = new Scanner(System.in);
        MenuCadastroCliente cliente = new MenuCadastroCliente();
        MenuGerenciamentoDeEstoque estoque = new MenuGerenciamentoDeEstoque();
        MenuAtendenteDeCaixa caixa = new MenuAtendenteDeCaixa();
        MenuCargo cargo = new MenuCargo();
        MenuHistoricoDeCompras compras = new MenuHistoricoDeCompras();
        String palavra = "";
        while (!palavra.equals("sair")) {
            System.out.println("1 CADASTRO DE CLIENTES");
            System.out.println("2 CADASTRO DE FUNCIONARIOS");
            System.out.println("3 GERENCIAMENTO DE ESTOQUE");
            System.out.println("4 CADASTRO DE CARGOS");
            System.out.println("5 HISTORICO DE COPRAS");
            System.out.println("SELECIONE UMA OPCAO:");
            palavra = sc.nextLine();
            switch (palavra) {
                
                case "cadastro de clientes":
                    cliente.exibirMenu();
                    break;
                    
                case "cadastro de funcionarios":
                    caixa.exibirMenu();
                    break;
                    
                case "gerenciamento de estoque":
                    estoque.exibirMenu();
                    break;
                    
                case "cadastro de cargos":
                    cargo.cadastrarCargo(banco);
                    break;
                    
                case "historico de compras":
                    compras.consulta(banco);
                    break;

                default:
                    System.out.println("fuck");
            }
        }
        System.out.println("1 CADASTRO DE CLIENTES");
        System.out.println("2 CADASTRO DE FUNCIONARIOS");
        System.out.println("3 GERENCIAMENTO DE ESTOQUE");

    }

}
