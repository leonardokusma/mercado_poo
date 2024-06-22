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
    private long idMerCliente;
    private Date dataNascimento;
    private MerContatoClien contatoClien;
    private MerEnderecoClien enderecoClien;

    public MerCliente(String nome, String cpf, Date dataNascimento, MerContatoClien contato, MerEnderecoClien endereco) {
        super(nome, cpf,dataNascimento);
        this.dataNascimento = dataNascimento;
        this.contatoClien = contato;
        this.enderecoClien = endereco;
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


