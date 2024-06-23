package sistema;

import java.util.Scanner;

public class MenuAtendenteDeCaixa {

    public static void incluirFuncionario() {
        dominio.Banco.adicionaFuncionario(businessRules.MerFuncionario.cadastrarFuncionario());
    }

    public static void consultar(dominio.Banco banco) {
        Scanner sc = new Scanner(System.in);
        System.out.println("INFORME O CPF DO FUNCIONARIO");
        String cpf = sc.nextLine();
        System.out.println(banco.buscaFuncionario(cpf));
    }

    public static void remover(dominio.Banco banco) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------REMOVE CLIENTE------");
        System.out.println("INFORME O CPF DO CLIENTE");
        String cpf = sc.nextLine();
        dominio.Banco.removeFuncionario((int) banco.buscaFuncionario(cpf).getIdFuncionario() - 1);
    }

    public static void Atualizar(dominio.Banco banco) {
        Scanner sc = new Scanner(System.in);
        System.out.println("INFORME O CPF DO Funcionario:");
        String cpf = sc.nextLine();
        dominio.MerFuncionario funcionario = banco.buscaFuncionario(cpf);
        System.out.println("Informe o que deseja atualizar:");
        String atributo = sc.nextLine();
        switch (atributo) {
            case "cpf":
                System.out.println("INFORME O CPF DO CLIENTE:");
                funcionario.setCpf(sc.nextLine());
                break;
            case "nome":
                System.out.println("INFORME O NOME DO CLIENTE:");
                funcionario.setNome(sc.nextLine());
                break;
            case "nascimento":
                System.out.println("INFORME A DATA DE NASCIMENTO");
                funcionario.setNascimento(businessRules.DataFormatador.datas(sc.nextLine()));
                break;
            default:
                System.out.println("DECIDAAAAAAAAA");
        }
    }

    public void exibirMenu() {
        dominio.Banco banco = new dominio.Banco();
        Scanner sc = new Scanner(System.in);
        System.out.println("1. INCLUIR NOVO FUNCIONARIO");
        System.out.println("2. CONSULTAR FUNCIONARIO");
        System.out.println("3. ATUALIZAR FUNCIONARIO");
        System.out.println("4. EXCLUIR FUNCIONARIO");
        System.out.println("SELECIONE UMA OPCAO:");
        int opcao = sc.nextInt();
        sc.nextLine();
        switch (opcao) {
            case 1:
                incluirFuncionario();
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
