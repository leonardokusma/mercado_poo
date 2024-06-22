package businessRules;

import java.util.Scanner;


public class MerEstoque {
    
    public static dominio.MerEstoque cadastroDeEstoque(){
        Scanner sc = new Scanner(System.in);
        System.out.println("------CADASTRO DE ESTOQUE------");
        System.out.println("INFORME A DESCRICAO DO ESTOQUE:");
        String descricao = sc.nextLine();
        dominio.MerEnderecoEstoque endereco = MerEnderecoEstoque.cadastroEndereco(sc);
        return new dominio.MerEstoque(descricao, endereco);
    }
    
}
