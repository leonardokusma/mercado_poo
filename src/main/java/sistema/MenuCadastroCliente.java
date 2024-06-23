package sistema;

import java.util.Scanner;

public class MenuCadastroCliente {

    public static void incluirCliente() {
        dominio.Banco.adicionaCliente(businessRules.MerCliente.cadastrar());
    }

    public static void consultar(dominio.Banco banco) {
        Scanner sc = new Scanner(System.in);
        System.out.println("INFORME O CPF DO CLIENTE");
        String cpf = sc.nextLine();
        System.out.println(banco.buscaCliente(cpf));
    }

    public static void remover(dominio.Banco banco) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------REMOVE CLIENTE------");
        System.out.println("INFORME O CPF DO CLIENTE");
        String cpf = sc.nextLine();
        dominio.Banco.removeCliente(banco.buscaCliente(cpf).getIdMerCliente());
    }
    
    public static void Atualizar(dominio.Banco banco){
        Scanner sc = new Scanner(System.in);
        System.out.println("INFORME O CPF DO CLIENTE:");
        String cpf = sc.nextLine();
        dominio.MerCliente cliente  = banco.buscaCliente(cpf);
        System.out.println("Informe o que deseja atualizar:");
        String atributo = sc.nextLine();
        switch(atributo){
            case "cpf":
                 System.out.println("INFORME O CPF DO CLIENTE:");
                 cliente.setCpf(sc.nextLine());
                 break;
            case "nome":
                System.out.println("INFORME O NOME DO CLIENTE:");
                cliente.setNome(sc.nextLine());
                break;
            case "nascimento":
                System.out.println("INFORME A DATA DE NASCIMENTO");
                cliente.setDataNascimento(businessRules.DataFormatador.datas(sc.nextLine()));
                break;
            default:
                System.out.println("DECIDAAAAAAAAA");
        }
    }
    
    public void exibirMenu(){
        dominio.Banco banco = new  dominio.Banco();
        Scanner sc = new Scanner(System.in);
        System.out.println("1. INCLUIR NOVO CLIENTE");
        System.out.println("2. CONSULTAR CLIENTE");
        System.out.println("3. ATUALIZAR CLIENTE");
        System.out.println("4. EXCLUIR CLIENTE");
        System.out.println("SELECIONE UMA OPCAO:");
        int opcao = sc.nextInt();
        sc.nextLine();
        switch(opcao){
            case 1:
                incluirCliente();
                break;
            case 2:
                consultar(banco);
                break;
            case 3: 
                remover(banco);
                break;
            case 4:
                Atualizar(banco);
                break;
            default:
                System.out.println("OPCAO INVALIDA");
        }
    }
}
