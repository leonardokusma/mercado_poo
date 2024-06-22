
package businessRules;

import java.util.Scanner;


public class MerProdutoEstoque {
    
    public static dominio.MerEstoqueProduto cadastroProdutoEstoque(dominio.MerEstoque estoque){
        Scanner sc = new Scanner(System.in);
        dominio.Banco banco = new dominio.Banco();
        System.out.println("SELECIONE UM PRODUTO PARA CADASTRAR");
        MerProdutoEstoque.exibirProdutos();
        System.out.println("DIGITE O ID DO PRODUTO:");
        long id = sc.nextLong();
        System.out.println("INFORME A QUANTIDADE:");
        int qtd = sc.nextInt();
        sc.nextLine();
        System.out.println("INFORME O PRECO UNITARIO:");
        double preco = sc.nextDouble();
        return new  dominio.MerEstoqueProduto(preco, qtd,banco.buscaProduto(id), estoque);
        
    }
    
    public static void exibirProdutos(){
        for(dominio.MerProduto produto : dominio.Banco.getProdutos()){
            System.out.println(produto);
        }
    }
}
