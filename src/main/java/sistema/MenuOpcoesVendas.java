package sistema;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MenuOpcoesVendas {
    
    public void venda(dominio.Banco banco){
        Scanner sc = new Scanner(System.in);
        System.out.println("VENDA:");
        System.out.println("INFORME O SEU ID (Duncionario):");
        long id = sc.nextLong();
        sc.nextLine();
        System.out.println("INFORME O CPF DO CLIENTE");
        String cpf = sc.nextLine();
        String produtos = "";
        List<dominio.MerEstoqueProduto> listaProd = new ArrayList();
        double valor  =0;
        
        while(!produtos.equals("finalizar")){
            System.out.println("INFORME UM PRODUTO OU DIGITE FINALIZAR:");
            produtos = sc.nextLine();
            if(produtos.equals("finalizar")){
                break;
            }
            listaProd.add(MenuOpcoesVendas.adicionaProduto(produtos, banco));
        }
        System.out.println("INFORME O TIPO DE PAGAMENTO:");
        String tipoPagamento = sc.nextLine();
        
        int qtd = 0;
        for(dominio.MerEstoqueProduto prod : listaProd){
            valor += prod.getPrecoUnitario();
            qtd ++;
        }
        dominio.Banco.adicionaVenda(new dominio.MerVenda(tipoPagamento, banco.buscaFuncionario(id), banco.buscaCliente(cpf), valor,qtd));
        
        
    }
    
    public static dominio.MerEstoqueProduto adicionaProduto(String nome, dominio.Banco banco){
        return banco.buscaProdutoEstoque(nome);
    }
}
