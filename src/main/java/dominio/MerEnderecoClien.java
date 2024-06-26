/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author João Ferrari
 */
public class MerEnderecoClien {
    private int idEnderecoClien;
    private String rua;
    private long numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String pontoRef;
    private String cep;
    private String descricao;

    public MerEnderecoClien(int id, String rua, long numero, String bairro, String cidade, String estado, String pontoRef, String cep, String descricao) {
        this.idEnderecoClien = id;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.pontoRef = pontoRef;
        this.cep = cep;
        this.descricao = descricao;
    }

    public int getIdEnderecoClien() {
        return idEnderecoClien;
    }

    public String getRua() {
        return rua;
    }

    public long getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getPontoRef() {
        return pontoRef;
    }

    public String getCep() {
        return cep;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setPontoRef(String pontoRef) {
        this.pontoRef = pontoRef;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
