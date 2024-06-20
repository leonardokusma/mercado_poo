/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.util.Date;

public class MerCliente extends MPessoa {

    private int idMerCliente;
    private int idContato;
    private int idEndereco;

    MerCliente(String nome, String cpf, Date data, int idMerCliente, int idContato, int idEndereco) {
        super(nome, cpf, data);
        this.idContato = idContato;
        this.idEndereco = idEndereco;
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

}
