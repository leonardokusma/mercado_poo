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
import java.io.Serializable;
import java.util.Date;


public class MerCliente extends MerPessoa implements Serializable{
    private static long id = 1;
    private long idMerCliente;
    private Date dataNascimento;
    private MerContatoClien contatoClien;
    private MerEnderecoClien enderecoClien;
    
    public MerCliente(String nome, String cpf, Date dataNascimento){
        super(nome, cpf,dataNascimento);
        this.idMerCliente = MerCliente.id;
        MerCliente.setId(id++);
    }

    public MerCliente(String nome, String cpf, Date dataNascimento, MerContatoClien contato, MerEnderecoClien endereco) {
        super(nome, cpf,dataNascimento);
        this.idMerCliente = MerCliente.id;
        MerCliente.setId(id++);
        this.dataNascimento = dataNascimento;
        this.contatoClien = contato;
        this.enderecoClien = endereco;
    }

    public static void setId(long id) {
        MerCliente.id = id;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setContatoClien(MerContatoClien contatoClien) {
        this.contatoClien = contatoClien;
    }

    public void setEnderecoClien(MerEnderecoClien enderecoClien) {
        this.enderecoClien = enderecoClien;
    }

    public long getIdMerCliente() {
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
 
}


