/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author João Ferrari
 */

import dominio.MerEnderecoClien;
import dominio.MerContatoClien;
import java.util.Date;


public class MerCliente extends MPessoa{
    private int idMerCliente;
    private Date dataNascimento;
    private MerContatoClien contatoClien;
    private MerEnderecoClien enderecoClien;

    public MerCliente(String nome, String cpf, Date dataNascimento, MerContatoClien contato, MerEnderecoClien endereco) {
        super(nome, cpf,dataNascimento);
        this.dataNascimento = dataNascimento;
        this.contatoClien = contato;
        this.enderecoClien = endereco;
    }

    public int getIdMerCliente() {
        return idMerCliente;
    }

    public MerContatoClien getMerContatoClien() {
        return contatoClien;
    }

    public MerEnderecoClien getMerEnderecoClien() {
        return enderecoClien;
    }

    public void setMerContatoClien(MerContatoClien merContatoClien) {
        this.contatoClien = merContatoClien;
    }

    public void setMerEnderecoClien(MerEnderecoClien merEnderecoClien) {
        this.enderecoClien = merEnderecoClien;
    }
    
    
    
    public static void main(String[] args) {
        // Exemplo de uso do GerenciadorCliente dentro da classe MerCliente

        // Criando um gerenciador de clientes
        GerenciadorCliente gerenciador = new GerenciadorCliente();

        try {
            // 1. Incluindo um novo cliente
            gerenciador.incluirCliente("João Silva", "123.456.789-01", // CPF de exemplo
                    new Date(), "11 1234-5678", "joao@email.com", 
                    "Rua A", "123", "São Paulo", "SP");

            // 2. Consultando o cliente pelo ID (assumir que o ID é 1)
            MerCliente cliente = gerenciador.consultarCliente(1);
            System.out.println("Cliente encontrado: " + cliente.getNome());

            // 3. Atualizando o cliente
            gerenciador.atualizarCliente(1, "João Silva Jr.", "123.456.789-01", 
                    new Date(), "11 98765-4321", "joao.jr@email.com",
                    "Rua B", "456", "São Paulo", "SP");

            // 4. Excluindo o cliente
            gerenciador.excluirCliente(1);
            System.out.println("Cliente excluído com sucesso.");

        } catch (ClienteNaoEncontradoException | IllegalArgumentException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }

    
}


