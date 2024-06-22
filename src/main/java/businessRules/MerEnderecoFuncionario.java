/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businessRules;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class MerEnderecoFuncionario {
    
    public static dominio.MerEnderecoFunc cadastroEndereco() {
        Scanner sc = new Scanner(System.in);
        System.out.println("DIGITE A RUA");
        String rua = sc.nextLine();
        System.out.println("DIGITE O NUMERO DE SUA RESIDENCIA");
        Long numero = sc.nextLong();
        sc.nextLine();
        System.out.println("DIGITE O SEU BAIRRO:");
        String bairro = sc.nextLine();
        System.out.println("DIGITE A SUA CIDADE:");
        String cidade = sc.nextLine();
        System.out.println("DIGITE O SEU ESTADO:");
        String estado = sc.nextLine();
        System.out.println("DIGITE O PONTO DE REFERENCIA:");
        String pontoRef = sc.nextLine();
        System.out.println("DIGITE O SEU CEP");
        String cep = sc.nextLine();
        return new dominio.MerEnderecoFunc(rua, numero, bairro, cidade, estado, pontoRef, cep);
    }
    
}
