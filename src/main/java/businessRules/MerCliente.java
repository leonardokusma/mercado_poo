package businessRules;

import static java.time.InstantSource.system;
import java.util.Date;
import java.util.Scanner;

public class MerCliente {

    private static boolean validarCPF(String cpf) {
        
        cpf = cpf.replaceAll("[^0-9]", "");

        // Verifica se o CPF possui 11 dígitos
        if (cpf.length() != 11) {
            return false;
        }

        // Verifica se todos os dígitos são iguais
        if (cpf.matches("(\\d)\\1{10}")) {
            return false;
        }

        // Validação dos dígitos verificadores
        try {
            int soma = 0;
            for (int i = 0; i < 9; i++) {
                soma += Integer.parseInt(String.valueOf(cpf.charAt(i))) * (10 - i);
            }
            int resto = soma % 11;
            int primeiroDigitoVerificador = (resto < 2) ? 0 : 11 - resto;

            if (Integer.parseInt(String.valueOf(cpf.charAt(9))) != primeiroDigitoVerificador) {
                return false;
            }

            soma = 0;
            for (int i = 0; i < 10; i++) {
                soma += Integer.parseInt(String.valueOf(cpf.charAt(i))) * (11 - i);
            }
            resto = soma % 11;
            int segundoDigitoVerificador = (resto < 2) ? 0 : 11 - resto;

            return Integer.parseInt(String.valueOf(cpf.charAt(10))) == segundoDigitoVerificador;

        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    public static dominio.MerCliente cadastrar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("------CADASTRO DE CLIENTE------");
        System.out.println("DIGITE O NOME DO CLIENTE:");
        String nome = sc.nextLine();
        System.out.println("DIGITE O CPF DO CLIENTE:");
        String cpf = sc.nextLine();
        if(!MerCliente.validarCPF(cpf)){
            System.out.println("CPF INVALIDO");
            System.out.println("DIGITE O CPF DO CLIENTE:");
            cpf = sc.nextLine();
        }
        System.out.println("DIGITE A DATA DE NASCIMENTO DO CLIENTE:");
        Date nascimento = DataFormatador.datas(sc.nextLine());
        dominio.MerCliente cliente = new dominio.MerCliente(nome,cpf,nascimento);
        // cadastro do contato
        System.out.println("DIGITE O TELEFONE DO CLIENTE:");
        String telefone = sc.nextLine();
        System.out.println("DIGITE O EMAIL DO CLIENTE:");
        String email = sc.nextLine();
        dominio.MerContatoClien contato = new dominio.MerContatoClien(telefone, email);
        cliente.setContatoClien(contato);
        // cadastro do endereco
        cliente.setEnderecoClien(MerEnderecoClien.cadastroEndereco());
        return cliente;
    }

}
