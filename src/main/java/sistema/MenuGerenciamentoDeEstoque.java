package sistema;

import java.util.Scanner;

public class MenuGerenciamentoDeEstoque {

    public static void cadastrarProduto() {
        dominio.Banco.adicionaProduto(businessRules.MerProduto.cadastroDeProduto());
    }

    public static void cadastrarEstoque() {
        dominio.Banco.adicionaEstoque(businessRules.MerEstoque.cadastroDeEstoque());
    }

    public static void cadastrarProdutoEstoque(dominio.Banco banco) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ESCOLHA O ESTOQUE:");
        MenuGerenciamentoDeEstoque.exibirEstoque();
        long id = sc.nextLong();
        sc.nextLine();
        businessRules.MerProdutoEstoque.cadastroProdutoEstoque(banco.buscaEstoque(id));

    }

    public static void atualizarEstoqueProduto(dominio.Banco banco) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ATUALIZAR ESTOQUE");
        System.out.println("INFORME O NOME DO PRODUTO");
        String nome = sc.nextLine();
        dominio.MerEstoqueProduto produto = banco.buscaProdutoEstoque(nome);
        System.out.println("Quantidade Atual:" + produto.getQtd());
        System.out.println("Digite a Nova Quantidade:");
        produto.setQtd(sc.nextInt());
        sc.nextLine();

    }
    
    public static void remover(dominio.Banco banco){
        Scanner sc = new Scanner(System.in);
        System.out.println("REMOVER PRODUTO");
        String nome = sc.nextLine();
        dominio.Banco.removeEstoqueProduto(banco.buscaProdutoEstoque(nome).getIdMerEstoqueProduto());
        
    }

    public static void exibirEstoque() {
        for (dominio.MerEstoque estoque : dominio.Banco.getEstoques()) {
            System.out.println(estoque);
        }
    }
    
    public void exibirMenu(){
        Scanner sc = new Scanner(System.in);
        dominio.Banco banco = new dominio.Banco();
        System.out.println("1 CADASTRAR PRODUTO");
        System.out.println("2 CADASTRAR ESTOQUE");
        System.out.println("3 ADASTRAR ESTOQUEPRODUTO");
        System.out.println("4 ATUALIZAR ESTOQUE PRODUTO");
        System.out.println("5 REMOVER PRODUTO");
        System.out.println("INFORME UMA OPCAO");
        int opcao = sc.nextInt();
        switch(opcao){
            case 1:
                MenuGerenciamentoDeEstoque.cadastrarProduto();
                break;
            case 2:
                MenuGerenciamentoDeEstoque.cadastrarEstoque();
                break;
            case 3:
                MenuGerenciamentoDeEstoque.cadastrarProdutoEstoque(banco);
                break;
            case 4:
                MenuGerenciamentoDeEstoque.atualizarEstoqueProduto(banco);
                break;
            case 5:
                MenuGerenciamentoDeEstoque.remover(banco);
                break;
            default:
                System.out.println("OPCAO INVALIDA!!");
        }
        
    }
}
