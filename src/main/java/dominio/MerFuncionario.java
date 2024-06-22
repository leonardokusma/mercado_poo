/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.io.Serializable;
import java.util.Date;


public class MerFuncionario extends MerPessoa implements Serializable{
    private static long id = 1;
    private long idFuncionario;
    private Cargo cargo;
    private MerEnderecoFunc endereco;
    private MerContatoFunc contato;
    private Date admissao;

    public MerFuncionario(String nome, String cpf, Date nascimento, Cargo cargo, MerEnderecoFunc endereco, MerContatoFunc contato, Date admissao) {
        super(nome, cpf, nascimento);
        this.idFuncionario = MerFuncionario.id;
        MerFuncionario.setId(id++);
        this.cargo = cargo;
        this.endereco = endereco;
        this.contato = contato;
        this.admissao = admissao;
    }

    public static void setId(long id) {
        MerFuncionario.id = id;
    }

    public long getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public Cargo getIdCargo() {
        return cargo;
    }

    public void setIdCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public MerEnderecoFunc getIdEndereco() {
        return endereco;
    }

    public void setIdEndereco(MerEnderecoFunc endereco) {
        this.endereco = endereco;
    }

    public MerContatoFunc getIdContato() {
        return contato;
    }

    public void setIdContato(MerContatoFunc contato) {
        this.contato = contato;
    }

    public Date getAdmissao() {
        return admissao;
    }

    public void setAdmissao(Date admissao) {
        this.admissao = admissao;
    }

}
