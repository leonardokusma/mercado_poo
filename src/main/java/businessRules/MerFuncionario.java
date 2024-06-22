/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businessRules;

import java.sql.SQLOutput;
import java.util.Date;
import java.util.Scanner;

public class MerFuncionario {

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

    public static dominio.MerFuncionario cadastrarFuncionario() {
        Scanner sc = new Scanner(System.in);
        dominio.Banco banco = new dominio.Banco();
        System.out.println("CADASTRAR FUNCIONARIO");
        System.out.println("DIGITE O NOME DO FUNCIONARIO:");
        String nome = sc.nextLine();
        System.out.println("DIGITE O CPF DO FUNCIONARIO:");
        String cpf = sc.nextLine();
        if (!MerFuncionario.validarCPF(cpf)) {
            System.out.println("CPF INVALIDO!");
            System.out.println("DIGITE O CPF DO FUNCIONARIO:");
            cpf = sc.nextLine();
        }
        System.out.println("DIGITE A DATA DE NASCIMENTO DO FUNCIONARIO:");
        Date nascimento = DataFormatador.datas(sc.nextLine());
        System.out.println("SELECIONE UM CARGO:");
        for (dominio.Cargo cargo : dominio.Banco.getCargos()) {
            System.out.println(cargo);
        }
        long idCargo = sc.nextLong();
        dominio.MerEnderecoFunc endereco  = MerEnderecoFuncionario.cadastroEndereco();
        // cadastro do contato do funcionario
        System.out.println("DIGITE O TELEFONE DO FUNCIONARIO:");
        String telefone = sc.nextLine();
        System.out.println("DIGITE O TELEFONE DO SETOR DO FUNCIONARIO:");
        String telefoneEmpresa = sc.nextLine();
        System.out.println("DIGITE O EMAIL DO CLIENTE:");
        String email = sc.nextLine();
        dominio.MerContatoFunc contato = new dominio.MerContatoFunc(telefone, telefoneEmpresa, email);
        
        return new dominio.MerFuncionario(nome, cpf, nascimento,banco.buscaCargo(idCargo) , endereco, contato, nascimento);
    }

}
