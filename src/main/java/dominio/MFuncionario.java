/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

<<<<<<< HEAD
=======
import java.io.Serializable;
>>>>>>> 681521f62cac8b3b8b71f9785dfdd834434d8ac8
import java.util.Date;

/**
 *
 * @author leona
 */
<<<<<<< HEAD
public class MFuncionario extends MPessoa {
=======
public class MFuncionario extends MPessoa implements Serializable{
>>>>>>> 681521f62cac8b3b8b71f9785dfdd834434d8ac8

    private int idFuncionario;
    private int idCargo;
    private int idEndereco;
    private int idContato;
    private Date admissao;

    public MFuncionario(String nome, String cpf, Date nascimento, int idFuncionario, int idCargo, int idEndereco, int idContato, Date admissao) {
        super(nome, cpf, nascimento);
        this.idFuncionario = idFuncionario;
        this.idCargo = idCargo;
        this.idEndereco = idEndereco;
        this.idContato = idContato;
        this.admissao = admissao;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public int getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }

    public int getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }

    public int getIdContato() {
        return idContato;
    }

    public void setIdContato(int idContato) {
        this.idContato = idContato;
    }

    public Date getAdmissao() {
        return admissao;
    }

    public void setAdmissao(Date admissao) {
        this.admissao = admissao;
    }

}
