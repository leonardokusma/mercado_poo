
package sistema;

import java.util.Scanner;


public class MenuHistoricoDeVendas {
    public void consulta(dominio.Banco banco) {
        Scanner sc = new Scanner(System.in);
        System.out.println("INFORME O CPF DO FUNCIONARIO:");
        String cpf = sc.nextLine();
        for (dominio.MerVenda venda : dominio.Banco.getVendas()) {
            if (venda.getFuncionario().getIdFuncionario() == banco.buscaFuncionario(cpf).getIdFuncionario()) {
                System.out.println(venda);
            }
        }
    }
    
}
