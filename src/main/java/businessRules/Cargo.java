/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businessRules;

import java.util.Scanner;

public class Cargo {
    
    public static dominio.Cargo cadastrarCargo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("------MERCADINHO BIG BOM------");
        System.out.println("CADASTRE UM CARGO");
        System.out.println("INFORME O APELIDO DO CARGO:");
        String apelido =sc.nextLine();
        System.out.println("INFORME A DESCRICAO DO CARGO:");
        String descricao = sc.nextLine();
        System.out.println("INFORME O SALARIO:");
        double salario = sc.nextDouble();
        dominio.Cargo cargo = new dominio.Cargo(apelido, descricao, salario);
        if(dominio.Banco.isRegistroCargo(apelido)){
            System.out.println("Cargo ja existe!");
            return null;
        }
        return cargo;
        
        
    }
    
}
