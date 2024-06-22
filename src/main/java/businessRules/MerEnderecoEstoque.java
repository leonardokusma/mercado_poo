package businessRules;

import java.util.Scanner;


public class MerEnderecoEstoque {

    public static dominio.MerEnderecoEstoque cadastroEndereco(Scanner sc){
        
        System.out.println("------CADASTRO DO ENDERECO DO ESTOQUE------");
        System.out.println("INFORME A RUA:");
        String rua = sc.nextLine();
        System.out.println("INFORME O NUMERO:");
        Long numero = sc.nextLong();
        sc.nextLine();
        System.out.println("INFORME O BAIRRO:");
        String bairro = sc.nextLine();
        System.out.println("INFORME A CIDADE");
        String cidade = sc.nextLine();
        System.out.println("INFORME O ESTADO:");
        String estado = sc.nextLine();
        System.out.println("INFORME O CEP:");
        String cep = sc.nextLine();
        return new  dominio.MerEnderecoEstoque(rua,bairro,cidade,estado,cep,numero);
                
    }
    
}
