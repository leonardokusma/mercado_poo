/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;


import java.util.Date;

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


    public void setIdMerCliente(int idMerCliente) {
        this.idMerCliente = idMerCliente;
    }

    public int getIdContato() {
        return idContato;
    }

    public void setIdContato(int idContato) {
        this.idContato = idContato;
    }

    public int getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
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
