
package businessRules;

import java.util.Scanner;


public class MerProduto {
    
    public static dominio.MerProduto cadastroDeProduto(){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("------CADASTRO DE PRODUTOS------");
        System.out.println("INFORME O NOME DO PRODUTO");
        String nome = sc.nextLine();
        if(dominio.Banco.isRegistroProduto(nome)){
            System.out.println("PRODUTO JA REGISTRADO!!!!!");
            return null;
        }
        System.out.println("INFORME A DESCRICAO DO PRODUTO:");
        String descricao = sc.nextLine();
        return new dominio.MerProduto(nome,descricao);
    }
    
}
