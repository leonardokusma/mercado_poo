package sistema;

import java.util.Scanner;

public class MenuHistoricoDeCompras {

    public void consulta(dominio.Banco banco) {
        Scanner sc = new Scanner(System.in);
        System.out.println("INFORME O CPF DO CLIENTE:");
        String cpf = sc.nextLine();
        for (dominio.MerVenda venda : dominio.Banco.getVendas()) {
            if (venda.getCliente().getIdMerCliente() == banco.buscaCliente(cpf).getIdMerCliente()) {
                System.out.println(venda);
            }
        }
    }
}
